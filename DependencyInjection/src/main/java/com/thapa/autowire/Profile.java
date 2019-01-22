package com.thapa.autowire;

import org.springframework.stereotype.Component;

@Component
public class Profile {
    private Person person;

    public Profile(Person person) {
        this.person = person;
    }

    public void show(){
        person.display();
    }
}
