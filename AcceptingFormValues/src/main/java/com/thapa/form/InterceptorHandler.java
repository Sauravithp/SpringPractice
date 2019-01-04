package com.thapa.form;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class InterceptorHandler extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Pre handling the request");
        if(request.getMethod().equals("POST")){
        return true;}
        else{
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if(modelAndView.getModelMap().containsKey("hobby")){
            String hobby=(String) modelAndView.getModelMap().get("hobby");
            if(hobby.equals("playing")){
                hobby="great"+" "+hobby;
                modelAndView.getModelMap().put("hobby",hobby);
            }

        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("After completion");
        ex.getMessage();
    }
}
