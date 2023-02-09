package com.sigong.iscall.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@Getter
public class CreateBoardReponse {
    private Long idx;
    private String title;
    private String content;
    private String writerId;
    private String fileGroup;
    private String categoryIdx;
    private String boardExpYn;
    private String commentExpYn;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deletedDate;
    private int likeCnt;
    private String notification_yn;
    private String tag;
    private String mustRead;
    private String attachedFileGroup;
    private String temporaryState;

}
