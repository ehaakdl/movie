package com.mose.movie.etc.define;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@ToString
@Getter
public enum eErrorInfo {
    DEFAULT(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR, "서버에서 처리하지 못한 에러 입니다."),
    BAD_PARAMETER(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "잘못된 요청 입니다."),
    FAIL_SIGNUP(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "회원가입 실패"),
    FAIL_LOGIN(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "로그인 실패");
    private final int httpCode;
    private final HttpStatus httpStatus;
    private final String message;
}