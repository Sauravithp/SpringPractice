package com.thapa.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student")
public class Student implements Person {

    public void display() {
        System.out.println("Student");
    }


}
