package com.swjd.demo1.com.swjd.controller;

import com.swjd.demo1.com.swjd.config.ClassProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello, spring boot!";
    }

    @Autowired
    private ClassProperties properties;

    @GetMapping("prop")
    public ClassProperties properties(){
        System.out.println("hello 我是hello controller");
        return properties;
    }
}
