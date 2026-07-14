package com.osathi_java_example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.osathi_java_example.demo.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "http://localhost:5173")
public class HelloController {
    @Autowired
    private HelloService helloService;
    
    @GetMapping
    public String sayHello() {
        return helloService.sayHello();
    }

    @GetMapping("/all")
    public List<com.osathi_java_example.demo.model.Hello> getAllHello() {
        return helloService.getAllHello();
    }
}
