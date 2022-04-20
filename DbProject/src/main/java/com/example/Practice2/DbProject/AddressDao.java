package com.example.Practice2.DbProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDao {

    @Autowired
    AddressRepository addressRepository;

    public void saveAddress(Address address){
        addressRepository.save(address);
    }

}
