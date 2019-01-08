package com.thapa.crud;

import com.thapa.crud.service.EmployeeDAO;
import com.thapa.crud.service.Rest;
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

    @Bean
    public Rest rest(EmployeeDAO empdao) {
//        return new CrudController(empdao);
        Rest rest=new Rest();
        rest.setEmployeeDAO(empdao);
        return rest;
    }

}
