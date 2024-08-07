package com.example.jpa.repo;

import com.example.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findAllByEmailEndingWith(String email);
}
