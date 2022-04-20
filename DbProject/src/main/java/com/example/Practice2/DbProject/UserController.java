package com.example.Practice2.DbProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/user")

public class UserController {

    @Autowired
    UserLogic userLogic;
    @PostMapping()
    public void createUser(@RequestBody User user)  {
        userLogic.createUser(user);

    }




}
