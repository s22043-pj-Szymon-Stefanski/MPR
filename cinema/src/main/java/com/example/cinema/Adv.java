package com.example.cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Adv {

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity<String> handlerException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND");
    }
}
