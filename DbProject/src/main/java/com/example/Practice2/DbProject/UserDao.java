package com.example.Practice2.DbProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
       return userRepository.save(user);
    }



}
