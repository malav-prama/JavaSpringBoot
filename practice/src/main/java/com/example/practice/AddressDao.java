package com.example.practice;

import com.example.practice.mongo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDao {

    @Autowired
    AddressRepository addressRepository;

    public void saveUser(Address address){
        addressRepository.save(address);
    }

    public void deleteAddress(String id)
    {
        addressRepository.deleteById(id);
    }

    public Address getAddress(String id)
    {
       return addressRepository.findById(id).get();
    }


}
