package com.example.board.dto;

import lombok.Data;

import java.util.List;

@Data
public class BoardDto {

    private int boardIdx;
    private String title;
    private String contents;
    private String hitCnt;
    private String creatorId;
    private String createdDatetime;
    private String updaterId;
    private String updatedDatetime;
    private List<BoardFileDto> fileList;

} // end class BoardDTO
