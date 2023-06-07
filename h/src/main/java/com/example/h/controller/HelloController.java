package com.example.h.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hlo";
    }
    @RequestMapping("/hi")
    public String String (String name){
        System.out.println(name);
        return "123";
    }
}
