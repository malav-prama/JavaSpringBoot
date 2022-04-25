package com.example.practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentLogic {

    @Autowired
    StudentDao studentDao;

    public void createStudent(Student student)  {
        studentDao.saveStudent(student);
    }
}