package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/all/{roll}")

        public Student getStudent(@PathVariable int roll)
        {
            return studentService.getStudent(roll);
        }




}
