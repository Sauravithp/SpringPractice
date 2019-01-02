package com.thapa.example;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "com.thapa.example")
//The component-scan is used to scan @component through out the basepackage , if basepackage isnt given by default it will scan the package where componentscan lies.
public class EmployeeConfig {

//    @Bean
//    public Employee employee(){
//        return new Employee();
//    }



}
