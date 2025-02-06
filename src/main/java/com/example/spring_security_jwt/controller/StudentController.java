package com.example.spring_security_jwt.controller;

import com.example.spring_security_jwt.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> list = new ArrayList<>(List.of(new Student(1,"Ganesh",88),
            new Student(2,"Varun", 18)));
    @GetMapping("/students")
    public List<Student> getStudents(){
        return list;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        list.add(student);
        return student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest){
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }
}
