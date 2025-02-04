package com.elifcan.librarymanagingsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    ZERO_PAGE_ERROR(4001,"Pages can not be zero.", HttpStatus.BAD_REQUEST),
    BAD_REQUEST(4002, "Entered parameter is invalid.", HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER(5000,"Unexpected error occurs.",HttpStatus.INTERNAL_SERVER_ERROR);

    int code;
    String message;
    HttpStatus httpStatus; // type of request
}
