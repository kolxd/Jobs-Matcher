package com.jobmatcher.controller;

import com.jobmatcher.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/app")
public class MainController {
    /**
     * Starting page
     *
     * @return the path to main page
     */
    @RequestMapping(method = RequestMethod.GET)
    public String homepage() {
        return "index.html";
    }

}