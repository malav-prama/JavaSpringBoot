package com.example.practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AddressLogic {

    @Autowired
    AddressDao addressDao;
    @Autowired
    StudentDao studentDao;

    @Transactional
    public void createAddress(Address address)  {
        Student student=address.getStudent();
        Student getStudent= studentDao.saveStudent(student);
        address.setStudent(getStudent);
        addressDao.saveAddress(address);

    }

}
