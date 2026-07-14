package com.osathi_java_example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osathi_java_example.demo.repository.HelloRepository;

@Service
public class HelloService {
    @Autowired 
    private HelloRepository helloRepository;
    
    public List<com.osathi_java_example.demo.model.Hello> getAllHello() {
        return helloRepository.findAll();
    }
    
    public String sayHello() {
        return "Hello, World! from backend service";
    }
}
