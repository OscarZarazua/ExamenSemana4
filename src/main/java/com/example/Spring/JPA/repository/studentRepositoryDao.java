package com.example.Spring.JPA.repository;

import com.example.Spring.JPA.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface studentRepositoryDao extends CrudRepository<Student, Integer>  {

}
