package com.example.spring_security_jwt.service;

import org.springframework.stereotype.Service;

@Service
public class JWTService {


    public String generateToken() {
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IlZpbm51IiwiaWF0IjoxNTE2MjM5MDIyfQ.vWU7nWrRA6Bb1BCD_wqX-QFhWvL3Mqh_9AAWgDmjodI";
    }
}
