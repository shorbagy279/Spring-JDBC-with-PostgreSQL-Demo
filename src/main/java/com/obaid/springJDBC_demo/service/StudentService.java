package com.obaid.springJDBC_demo.service;

import com.obaid.springJDBC_demo.model.Student;
import com.obaid.springJDBC_demo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {


    public void AddStudent(Student st) {
        System.out.println("Added..");
    }
    @Autowired
    Repo repo;

    public List<Map<String, Object>> getStudents() {
        return repo.findAll();
    }
}
