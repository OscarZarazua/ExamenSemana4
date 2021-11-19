package com.example.Spring.JPA.controller;

import com.example.Spring.JPA.entity.Student;
import com.example.Spring.JPA.services.studentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class studentController {
    @Autowired
    private studentServices services;

    @GetMapping("/{name}")
    public String nombre(@PathVariable String name){
        return name;
    }

    @PostMapping("/")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        System.out.println("Se realizo la solicitud correctamente ");
        services.addStudent(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/{pornombre}/{nombrevariable}")
    public Student getStudentByName(@PathVariable("nombrevariable") String name) {
        return services.getStudent(name);
    }
}
