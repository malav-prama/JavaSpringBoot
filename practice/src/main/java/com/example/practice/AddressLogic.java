package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AddressLogic {

    @Autowired
    AddressDaoSql addressDaoSql;


    public void createAddress(Address address)  {
        addressDaoSql.saveAddress(address);
    }

    public void updateAddress(Address address){
        addressDaoSql.saveAddress(address);
        //what method to use in order to update since I do not find any such method in the CrudRepository? Is it by id?
    }

    public void deleteAddress(Integer id)
    {
        addressDaoSql.deleteAddress(id);

    }

    public Address getAddress(Integer id)
    {
    return addressDaoSql.getAddress(id);
    }
}
