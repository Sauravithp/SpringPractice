package com.thapa.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args){
        ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfig.class);
//        Application context is an interface that is used to load the confiuration information to the application
        Employee employee=context.getBean(Employee.class);
//        It is used create all the beans that are defined by config class
        employee.setId(1);
        employee.setName("Sauravi");
        System.out.println(employee.getName());

        Employee employee1=context.getBean(Employee.class);
        employee1.setId(2);
        employee1.setName("Ram");
        System.out.println(employee1.getName());


        Employee emp=context.getBean(Employee.class);
        System.out.println(emp.getName());



// scoping beans:while using SINGLETON only one bean is created through out the application like in this
//        While using PROTOTYPE  creates a new bean each time the bean is loaded into or retrieved from the application context
    }
}
