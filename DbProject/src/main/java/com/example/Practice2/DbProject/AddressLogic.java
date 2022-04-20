package com.example.Practice2.DbProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AddressLogic {

    @Autowired
    AddressDao addressDao;
    @Autowired
    UserDao userDao;

     @Transactional
    public void createAddress(Address address)  {
        User user=address.getUser();
        User getUser= userDao.saveUser(user);
        address.setUser(getUser);
        addressDao.saveAddress(address);

    }

}
