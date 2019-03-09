package com.testexample.technicalprofile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/amolsaudar")
    public String getHomePage(){
        return "index";
    }

    @RequestMapping("/hi")
    public String getHello(){
        return "hello";
    }
}
