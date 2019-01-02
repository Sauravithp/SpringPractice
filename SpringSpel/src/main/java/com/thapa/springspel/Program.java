package com.thapa.springspel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Author author=(Author) context.getBean(Author.class);

        System.out.println(author.toString());
    }


}
