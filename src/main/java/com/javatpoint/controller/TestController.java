package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/test")  
    public ModelAndView helloWorld() {  
        String message = "Hello World, Spring MVC @ Javatpoint test";  
        return new ModelAndView("test", "message", message);  
    }  
}
