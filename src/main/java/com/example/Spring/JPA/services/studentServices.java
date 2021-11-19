package com.example.Spring.JPA.services;

import com.example.Spring.JPA.entity.Student;
import com.example.Spring.JPA.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServices {

    @Autowired
    studentRepository studentRepo;

    public void addStudent(Student student){

        studentRepo.creacionStudent(student);
    }

    public List<Student> getLista(){

        return null;
    }

    public Student getStudent(String name) {
        return null;
    }
}

