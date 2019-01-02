package com.thapa.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id;
    private String name;


    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

@Value(value = "1")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

@Value(value ="Sauravi")
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                 +
                '}';
    }
}
