package com.thapa.crudwithjpa.configuration;

import com.thapa.crudwithjpa.service.EmployeeService;
import com.thapa.crudwithjpa.serviceimpl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.thapa.crudwithjpa.configuration", "com.thapa.crudwithjpa.restcontroller", "com.thapa.crudwithjpa.serviceimpl"})
public class WebConfig extends WebMvcConfigurerAdapter {

}
