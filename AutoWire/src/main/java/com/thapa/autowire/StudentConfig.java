package com.thapa.autowire;

import com.thapa.student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.thapa.student")
public class StudentConfig {

}
