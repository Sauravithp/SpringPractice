package com.thapa.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(ProfileConfig.class);
        Profile profile=(Profile) context.getBean(Profile.class);
        profile.print();
    }
}
