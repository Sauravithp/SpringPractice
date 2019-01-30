package com.thapa.crudwithjpa.controller.exceptionhandler;

import com.thapa.crudwithjpa.entity.ErrorMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private ErrorMsg errorMsg;


    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<ErrorMsg> nullPointerExceptionHandler(){
        errorMsg.setErrorMsg("Null Pointer exception has occured");
        return new ResponseEntity<>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = ClassNotFoundException.class)
    public ResponseEntity<ErrorMsg> classNotFoundExceptionHandler(){
        errorMsg.setErrorMsg("class not found  exception has occured");
        return new ResponseEntity<>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
