package com.example.Spring.JPA.repository;

import com.example.Spring.JPA.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class studentRepository {

    @Autowired
    studentRepositoryDao studentRepositoryDao;

    public void creacionStudent(Student student){
            studentRepositoryDao.save(student);
    }
}
