package com.thapa.form;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver vr=new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        return vr;
    }
    
    //IS IT MANDATORY TO ADD 'addPathPattern()' ?
    //WHY NOT TRY WITHOUT ONE? ;)

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new InterceptorHandler()).addPathPatterns("/");
        registry.addInterceptor(new InterceptorHandler()).addPathPatterns("/form");
    }
}
