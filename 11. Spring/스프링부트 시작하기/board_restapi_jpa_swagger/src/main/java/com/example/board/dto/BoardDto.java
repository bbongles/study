package com.example.board.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(value = "BoardDto : 게시글 내용", description = "게시글 내용")
@Data
public class BoardDto {

    @ApiModelProperty(value = "게시글 번호")
    private int boardIdx;

    @ApiModelProperty(value = "게시글 제목")
    private String title;

    @ApiModelProperty(value = "게시글 내용")
    private String contents;

    @ApiModelProperty(value = "조회수")
    private String hitCnt;

    @ApiModelProperty(value = "작성자 아이디")
    private String creatorId;

    @ApiModelProperty(value = "작성 시간")
    private String createdDatetime;

    @ApiModelProperty(value = "수정자 아이디")
    private String updaterId;

    @ApiModelProperty(value = "수정 시간")
    private String updatedDatetime;

    @ApiModelProperty(value = "첨부파일 목록")
    private List<BoardFileDto> fileList;

} // end class BoardDTO
