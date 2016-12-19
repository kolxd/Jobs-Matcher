package com.jobmatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/app")
public class MainController {

    @RequestMapping("/")
    public String homepage(){
        return "homepage";
    }


}
