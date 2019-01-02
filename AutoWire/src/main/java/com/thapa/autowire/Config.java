package com.thapa.autowire;

import com.thapa.student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

    @Bean
//    since the class profile is injected with dependency , the wiring is done here.
    public Profile profile(Student student){

        return new Profile(student);
    }
//
//    @Bean
//    public Student getStudent(){
//        return new Student();
//    }
}
