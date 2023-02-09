package com.sigong.iscall.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class CreateBoardDTO {
    private String title;
    private String content;
    private String writerId;
}
