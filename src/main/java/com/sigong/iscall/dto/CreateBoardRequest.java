package com.sigong.iscall.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class CreateBoardRequest {
    private String title;
    private String content;
    private String writerId;
}
