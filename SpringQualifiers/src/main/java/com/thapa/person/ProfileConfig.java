package com.thapa.person;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProfileConfig {

    @Bean
    public Profile profile(@Qualifier("student") Person person){
           Profile profile= new Profile(person);
           profile.setPerson(person);

           return profile;
    }


}
