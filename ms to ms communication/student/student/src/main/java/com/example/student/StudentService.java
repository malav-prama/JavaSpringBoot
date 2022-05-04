package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentDao StudentDao;
//    public void addStudent(Student student)
//    {
//StudentDao.save(student);
//    }

   public Student getStudent(int roll)
   {
       return StudentDao.findById(roll).get();
   }
}
