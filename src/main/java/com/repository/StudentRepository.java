package com.repository;

import com.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public void save(Student student) {

        students.add(student);
    }

    public List<Student> findAll() {

        return students;
    }
}