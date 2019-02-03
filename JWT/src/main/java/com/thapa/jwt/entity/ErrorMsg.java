package com.thapa.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ErrorMsg {
    private String errorMsg;

    @Override
    public String toString() {
        return "ErrorMsg{" +
                "errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
