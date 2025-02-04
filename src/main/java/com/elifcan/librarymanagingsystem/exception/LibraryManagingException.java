package com.elifcan.librarymanagingsystem.exception;

import lombok.Getter;

@Getter
public class LibraryManagingException extends RuntimeException { // because error only occurs when the application run

    private ErrorType errorType;
    public LibraryManagingException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

}
