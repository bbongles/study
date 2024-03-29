package com.example.board.service;

import com.example.board.common.FileUtils;
import com.example.board.dto.BoardDto;
import com.example.board.dto.BoardFileDto;
import com.example.board.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Iterator;
import java.util.List;

@Service
@Transactional
@Slf4j
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Autowired
    private FileUtils fileUtils;

    @Override
    public void updateBoard(BoardDto board) throws Exception {

        boardMapper.updateBoard(board);

    } // end updateBoard()

    @Override
    public void deleteBoard(int boardIdx) throws Exception {

        boardMapper.deleteBoard(boardIdx);

    } // end deleteBoard()

    @Override
    public BoardFileDto selectBoardFileInformation(int idx, int boardIdx) throws Exception {

        return boardMapper.selectBoardFileInformation(idx, boardIdx);

    } // end selectBoardFileInformation()

    @Override
    public void insertBoard(BoardDto board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {

        boardMapper.insertBoard(board);

        List<BoardFileDto> list = fileUtils.parseFileInfo(board.getBoardIdx(), multipartHttpServletRequest);

        if (CollectionUtils.isEmpty(list) == false) {
            boardMapper.insertBoardFileList(list);

        }

        /*
        if (ObjectUtils.isEmpty(multipartHttpServletRequest) == false) {
            Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
            String name;
            while (iterator.hasNext()) {
                name = iterator.next();
                log.debug("file tag name : " + name);
                List<MultipartFile> list = multipartHttpServletRequest.getFiles(name);
                for (MultipartFile multipartFile : list) {
                    log.debug("start file information");
                    log.debug("file name : " + multipartFile.getOriginalFilename());
                    log.debug("file size : " + multipartFile.getSize());
                    log.debug("file content type : " + multipartFile.getContentType());
                    log.debug("end file information \n");

                }

            }

        }
        */

    } // end insertBoard()

    @Override
    public BoardDto selectBoardDetail(int boardIdx) throws Exception {

        boardMapper.updateHitCount(boardIdx);
        // Transaction 테스트를 위한 예외 발생용
        // int i = 10 / 0;
        BoardDto board = boardMapper.selectBoardDetail(boardIdx);
        List<BoardFileDto> fileList = boardMapper.selectBoardFileList(boardIdx);
        board.setFileList(fileList);

        boardMapper.updateHitCount(boardIdx);

        return board;

    } // end selectBoardDetail()

    @Override
    public List<BoardDto> selectBoardList() throws Exception {

        return boardMapper.selectBoardList();

    } // end selectBoardList()

} // end class BoardServiceImpl
