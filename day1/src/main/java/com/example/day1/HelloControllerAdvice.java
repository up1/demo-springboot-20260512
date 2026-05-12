package com.example.day1;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HelloControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public MyError doError(Exception e) {
        var error = new MyError(500, e.getMessage());
        return error;
    }

}
