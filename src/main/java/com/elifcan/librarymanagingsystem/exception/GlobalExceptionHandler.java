package com.elifcan.librarymanagingsystem.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // spring creates object to run
@Slf4j // used to log
public class GlobalExceptionHandler {

    // to catch possible errors, all objects should be checked
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> exceptionHandler(RuntimeException exception){
        return ResponseEntity.ok(exception.getMessage());
    }

}
