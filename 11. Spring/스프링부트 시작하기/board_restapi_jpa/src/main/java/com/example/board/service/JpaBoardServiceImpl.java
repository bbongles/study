package com.example.board.service;

import com.example.board.common.FileUtils;
import com.example.board.entity.BoardEntity;
import com.example.board.entity.BoardFileEntity;
import com.example.board.repository.JpaBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;
import java.util.Optional;

@Service
public class JpaBoardServiceImpl implements JpaBoardService {

    @Autowired
    JpaBoardRepository jpaBoardRepository;

    @Autowired
    FileUtils fileUtils;

    @Override
    public List<BoardEntity> selectBoardList() throws Exception {

        return jpaBoardRepository.findAllByOrderByBoardIdxDesc();

    } // end selectBoardList()

    @Override
    public void saveBoard(BoardEntity board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {

        board.setCreatorId("admin");
        System.out.println("서비스임플 : " + board.toString());
        List<BoardFileEntity> list = fileUtils.parseFileInfo(multipartHttpServletRequest);
        if (CollectionUtils.isEmpty(list) == false) {
            board.setFileList(list);
        }

        jpaBoardRepository.save(board);

    } // end saveBoard()

    @Override
    public BoardEntity selectBoardDetail(int boardIdx) throws Exception {

        Optional<BoardEntity> optional = jpaBoardRepository.findById(boardIdx);
        if (optional.isPresent()) {
            BoardEntity board = optional.get();
            board.setHitCnt(board.getHitCnt() + 1);
            jpaBoardRepository.save(board);

            return board;

        } else {
            throw new NullPointerException();

        }

    } // end selectBoardDetail()

    @Override
    public void deleteBoard(int boardIdx) {

        jpaBoardRepository.deleteById(boardIdx);

    } // end deleteBoard()

    @Override
    public BoardFileEntity selectBoardFileInformation(int boardIdx, int idx) throws Exception {

        BoardFileEntity boardFile = jpaBoardRepository.findBoardFile(boardIdx, idx);

        return boardFile;

    } // end selectBoardFileInformation()

} // end class JpaBoardServiceImpl
