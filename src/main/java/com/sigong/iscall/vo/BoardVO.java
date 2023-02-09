package com.sigong.iscall.vo;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
public class BoardVO {
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
