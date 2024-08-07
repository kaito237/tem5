package com.example.jpa;

import com.example.jpa.model.Student;
import com.example.jpa.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    //READ
    public List<Student> readAll() {
        return studentRepository.findAll();
    }
    public Student readOne(Long id){
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }

}