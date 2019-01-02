package com.thapa.person;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Qualifier("employee")
public class Employee implements Person {
//    String id;
//    String name;
//
//    public Employee() {
//    }
//
//    public Employee(String id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    @Value("1")
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Value("Sauravi")
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }

    public void display() {
        System.out.println("It is an Employee Class");
    }
}
