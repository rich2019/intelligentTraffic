package com.boot.controller;

import com.boot.config.JdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private JdbcConfig jdbcConfig;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
