package com.example.board.service;

import com.example.board.dto.BoardDto;
import com.example.board.dto.BoardFileDto;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

public interface BoardService {

    List<BoardDto> selectBoardList() throws Exception;
    void insertBoard(BoardDto board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;
    BoardDto selectBoardDetail(int boardIdx) throws Exception;
    void updateBoard(BoardDto board) throws Exception;
    void deleteBoard(int boardIdx) throws Exception;
    BoardFileDto selectBoardFileInformation(int idx, int boardIdx) throws Exception;

} // end interface BoardService
