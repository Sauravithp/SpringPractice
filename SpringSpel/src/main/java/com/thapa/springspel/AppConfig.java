package com.thapa.springspel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class AppConfig {

    @Bean("authorBean")
    public Author author(){
        return new Author();
    }

    @Bean("bookbean")
    public Book book(){
        return new Book();
    }

}
