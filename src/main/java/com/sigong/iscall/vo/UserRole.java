package com.sigong.iscall.vo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserRole {
    GUEST("ROLE_GUEST","손님"),
    USER("ROLE_USER","회원"),
    ADMIN("ROLE_ADMIN","관리자");

    private final String key;
    private final String title;


}
