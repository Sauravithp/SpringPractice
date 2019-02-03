package com.thapa.crud.entity;

import org.springframework.stereotype.Component;

@Component
public class ErrorMsg {
    private String message;

    public ErrorMsg() {
    }

    public ErrorMsg(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorMsg{" +
                "message='" + message + '\'' +
                '}';
    }
}
