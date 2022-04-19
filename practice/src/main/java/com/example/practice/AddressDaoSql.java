package com.example.practice;

import com.example.practice.repository.AddressMySQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDaoSql {

    @Autowired
    AddressMySQLRepository addressMySQLRepository;



    public Address getAddress(Integer id)
    {
      return addressMySQLRepository.findById(id).get();
    }

    public void deleteAddress(Integer id)
    {
        addressMySQLRepository.deleteById(id);
    }

    public void saveAddress(Address address)
    {
         addressMySQLRepository.save(address);
    }

}
