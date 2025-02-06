package com.example.spring_security_jwt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String greet(HttpServletRequest httpServletRequest){
        return "Welcome Vinnu" + httpServletRequest.getSession().getId();
    }

}
