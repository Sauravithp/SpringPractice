package com.thapa.crud.configuration;

import com.thapa.crud.interceptor.InterceptorHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.thapa.crud.controller", "com.thapa.crud.dao",
        "com.thapa.crud.entity","com.thapa.crud.dao.impl"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorHandler()).addPathPatterns("/getall");
    }





}
