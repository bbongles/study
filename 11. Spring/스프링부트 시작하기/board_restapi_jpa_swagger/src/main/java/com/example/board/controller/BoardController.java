package com.example.board.controller;

import com.example.board.dto.BoardDto;
import com.example.board.dto.BoardFileDto;
import com.example.board.service.BoardService;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class BoardController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BoardService boardService;

    @RequestMapping("/board/openBoardList.do")
    public ModelAndView openBoardList() throws Exception {

        log.debug("openBoardList");

        // ExceptionHandler 테스트를 위한 예외 발생 코드
        // int i = 10 / 0;

        ModelAndView mv = new ModelAndView("/board/boardList");

        List<BoardDto> list = boardService.selectBoardList();
        mv.addObject("list", list);

        return mv;

    } // end openBoardList()

    @RequestMapping("/board/openBoardWrite.do")
    public String openBoardWrite() throws Exception {
        return "/board/boardWrite";

    } // end openBoardWrite()

    @RequestMapping("/board/insertBoard.do")
    public String insertBoard(BoardDto board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {

        boardService.insertBoard(board, multipartHttpServletRequest);

        return "redirect:/board/openBoardList.do";

    } // end insertBoard()

    @RequestMapping("/board/openBoardDetail.do")
    public ModelAndView openBoardDetail(@RequestParam int boardIdx) throws Exception {

        ModelAndView mv = new ModelAndView("/board/boardDetail");

        BoardDto board = boardService.selectBoardDetail(boardIdx);
        mv.addObject("board", board);

        return mv;

    } // end openBoardDetail()

    @RequestMapping("/board/updateBoard.do")
    public String updateBoard(BoardDto board) throws Exception {

        boardService.updateBoard(board);

        return "redirect:/board/openBoardList.do";

    } // end updateBoard()

    @RequestMapping("/board/deleteBoard.do")
    public String deleteBoard(int boardIdx) throws Exception {

        boardService.deleteBoard(boardIdx);

        return "redirect:/board/openBoardList.do";

    } // end deleteBoard()

    @RequestMapping("/board/downloadBoardFile.do")
    public void downloadBoardFile(@RequestParam int idx, @RequestParam int boardIdx, HttpServletResponse response) throws Exception {
        BoardFileDto boardFile = boardService.selectBoardFileInformation(idx, boardIdx);
        if (ObjectUtils.isEmpty(boardFile) == false) {
            String fileName = boardFile.getOriginalFileName();

            byte[] files = FileUtils.readFileToByteArray(new File(boardFile.getStoredFilePath()));

            response.setContentType("application/octet-stream");
            response.setContentLength(files.length);
            response.setHeader("Content-Disposition", "attachment; fileName=\"" + URLEncoder.encode(fileName, "UTF-8") + "\";");
            response.setHeader("Content-Transfer-Encoding", "binary");

            response.getOutputStream().write(files);
            response.getOutputStream().flush();
            response.getOutputStream().close();

        }

    } // end downloadBoardFile()

} // end class BoardController
