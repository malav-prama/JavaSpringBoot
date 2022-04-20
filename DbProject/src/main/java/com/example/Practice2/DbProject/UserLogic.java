package com.example.Practice2.DbProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogic {

    @Autowired
    UserDao userDao;

    public void createUser(User user)  {
        userDao.saveUser(user);
    }
}
