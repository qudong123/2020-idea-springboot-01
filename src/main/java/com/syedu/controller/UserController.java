package com.syedu.controller;

import com.syedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/test")
    public String test(){
        userService.test();
        return "test";
    }

    public void test2(){

    }
}
