package com.thapa.crud.service;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullpointerException(NullPointerException e){
        System.out.println("Exception has occured");
        return "Nullpointer Exception has occured";
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public String handleArithmeticException(ArithmeticException e){
        System.out.println("Exception has occured");
        return "Arithmetic Exception has occured";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException(ArithmeticException e){
        System.out.println("Exception has occured");
        //SMALL ERROR HERE! 
        //LESS COPY AND PASTE ;)
        //REMOVE THE COMMENTS AFTER YOU'VE FIXED IT.
        return "Arithmetic Exception has occured";
    }
}
