package com.example.practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/student2")

public class StudentController {

    @Autowired
    StudentLogic studentLogic;
    @PostMapping()
    public void createUser(@RequestBody Student student)  {
        studentLogic.createStudent(student);

    }

}
