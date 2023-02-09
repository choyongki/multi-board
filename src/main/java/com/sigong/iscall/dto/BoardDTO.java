package com.sigong.iscall.dto;

import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Service
public class BoardDTO {
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
