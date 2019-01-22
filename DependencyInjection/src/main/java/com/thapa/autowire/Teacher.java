package com.thapa.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("teacher")
public class Teacher implements Person {
    public void display() {
        System.out.println("Teacher");
    }
}
