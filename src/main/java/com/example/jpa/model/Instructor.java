package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "advisor")
    private List<Student> advisingStudents;

    @OneToMany(mappedBy = "instructor")
    private List<Lecture> lectures;
}