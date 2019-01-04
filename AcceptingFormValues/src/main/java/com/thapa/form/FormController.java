package com.thapa.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @RequestMapping(value = "/")
    public ModelAndView homepage(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("form");
        return mv;
    }

    @RequestMapping(value = "/form",method = RequestMethod.POST)
    public ModelAndView form(@RequestParam ("name") String name, @RequestParam ("age") int age, @RequestParam("hobby") String hobby){
        ModelAndView mv =new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.addObject("hobby",hobby);

        mv.setViewName("result");
        throw new RuntimeException("Test");
    }
}
