package com.example.practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDao {

    @Autowired
    AddressRepo addressRepository;

    public void saveAddress(Address address){
        addressRepository.save(address);
    }

}
