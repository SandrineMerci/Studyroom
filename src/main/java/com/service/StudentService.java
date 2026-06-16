package com.service;

import com.model.Student;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(String id, String name) {

        studentRepository.save(new Student(id, name));
    }

    public void displayStudents() {

        studentRepository.findAll().forEach(System.out::println);
    }
}