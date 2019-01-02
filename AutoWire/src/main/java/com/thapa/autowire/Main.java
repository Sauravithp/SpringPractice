package com.thapa.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Profile profile = (Profile) context.getBean(Profile.class);

        profile.printID();
        profile.printName();



    }
}
