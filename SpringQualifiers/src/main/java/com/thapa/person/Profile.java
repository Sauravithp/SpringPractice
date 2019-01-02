package com.thapa.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Profile {

    private Person person;


    public Profile(Person person) {
    }



    @Autowired
    @Qualifier("student")
//Since injecting an interface can result in ambiguity.An interface can have many implemetations which might confuse the spring.
// So Qualifiers are used to identify the bean with the help of beanID,here student is a beanID.
    public void setPerson(Person person) {
        this.person = person;
    }

    public void print() {
        person.display();
    }


}
