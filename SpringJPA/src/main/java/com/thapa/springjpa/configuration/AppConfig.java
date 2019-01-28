package com.thapa.springjpa.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.thapa.springjpa.entity","com.thapa.springjpa.configuration"})
public class AppConfig {
}
