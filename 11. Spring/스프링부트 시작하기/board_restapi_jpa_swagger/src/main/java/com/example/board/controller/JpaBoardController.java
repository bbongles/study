package com.example.board.controller;

import com.example.board.entity.BoardEntity;
import com.example.board.entity.BoardFileEntity;
import com.example.board.service.JpaBoardService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class JpaBoardController {

    @Autowired
    private JpaBoardService jpaBoardService;

    @RequestMapping(value = "/jpa/board", method = RequestMethod.GET)
    public ModelAndView openBoardList() throws Exception {

        ModelAndView mv = new ModelAndView("/board/jpaBoardList");

        List<BoardEntity> list = jpaBoardService.selectBoardList();
        mv.addObject("list", list);

        return mv;

    } // end openBoardList()

    @RequestMapping(value = "/jpa/board/write", method = RequestMethod.GET)
    public String openBoardWrite() throws Exception {

        return "/board/jpaBoardWrite";

    } // end openBoardWrite()

    @RequestMapping(value = "/jpa/board/write", method = RequestMethod.POST)
    public String insertBoard(BoardEntity board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {

        jpaBoardService.saveBoard(board, multipartHttpServletRequest);

        return "redirect:/jpa/board";

    } // end insertBoard()

    @RequestMapping(value = "/jpa/board/{boardIdx}", method = RequestMethod.GET)
    public ModelAndView openBoardDetail(@PathVariable("boardIdx") int boardIdx) throws Exception {

        ModelAndView mv = new ModelAndView("/board/jpaBoardDetail");
        BoardEntity board = jpaBoardService.selectBoardDetail(boardIdx);

        mv.addObject("board", board);

        return mv;

    } // end openBoardDetail()


    @RequestMapping(value = "/jpa/board/{boardIdx}", method = RequestMethod.PUT)
    public String updateBoard(BoardEntity board) throws Exception {

        jpaBoardService.saveBoard(board, null);
        System.out.println("컨트롤러 : " + board.toString());

        return "redirect:/jpa/board";

    } // end updateBoard()


    @RequestMapping(value = "/jpa/board/{boardIdx}", method = RequestMethod.DELETE)
    public String deleteBoard(@PathVariable("boardIdx") int boardIdx) throws Exception {

        jpaBoardService.deleteBoard(boardIdx);

        return "redirect:/jpa/board";

    } // end deleteBoard()

    @RequestMapping(value = "/jpa/board/file", method = RequestMethod.GET)
    public void downloadBoardFile(@RequestParam int idx, @RequestParam int boardIdx, HttpServletResponse response) throws Exception {
        BoardFileEntity boardFile = jpaBoardService.selectBoardFileInformation(boardIdx, idx);
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

} // end class RestBoardController
