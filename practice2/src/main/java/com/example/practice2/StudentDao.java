package com.example.practice2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student)
    {
       return studentRepo.save(student);
    }


}
