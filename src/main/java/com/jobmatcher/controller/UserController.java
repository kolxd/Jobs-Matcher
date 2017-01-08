package com.jobmatcher.controller;

import com.jobmatcher.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gevlad on 08-Jan-17.
 */
@RestController
public class UserController {

    @Autowired
    MainService mainService;

}
