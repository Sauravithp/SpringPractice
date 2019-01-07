package com.thapa.crud;

import com.thapa.crud.service.EmployeeDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        return vr;
    }

    @Bean
    public CrudController crudController(EmployeeDAO empdao) {
//        return new CrudController(empdao);
        CrudController crudcontroller = new CrudController();
        crudcontroller.setEmployeeDAO(empdao);
        return crudcontroller;
    }

}

//Two things: First, I suggest you mention the reason why you'd use the afforementioned annotations.
//For example, why is it necessary to use @ComponentScan for this particular class or say why @Bean to create and 
//return a CrudController object or say why @Configuration or @EnableWebMvc anotations?
//Second, the artifact/ code you've created would be better documented than usually found if you can
// explain as to why you'd use 'ViewResolver' bean in this Adapter class?
