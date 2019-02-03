package com.thapa.crud.dao;


import com.thapa.crud.entity.ErrorMsg;
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
    public ResponseEntity<ErrorMsg> handleNullpointerException(NullPointerException e) {
        System.out.println("Exception has occured");
        errorMsg.setMessage("Null Pointer");
        return new ResponseEntity<ErrorMsg>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public String handleArithmeticException(ArithmeticException e) {
        System.out.println("Exception has occured");
        return "Arithmetic Exception has occured";
    }


}
