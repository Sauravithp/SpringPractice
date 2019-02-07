package com.thapa.jwt.configuration;

import com.thapa.jwt.interceptor.InterceptorHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.thapa.jwt.configuration",
        "com.thapa.jwt.entity", "com.thapa.jwt.controller",
        "com.thapa.jwt.service", "com.thapa.jwt.globalexceptionhandler"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorHandler()).addPathPatterns("/users/viewall");
    }
}
