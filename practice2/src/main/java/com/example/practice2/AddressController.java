package com.example.practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/address2")

public class AddressController {

    @Autowired
    AddressLogic addressLogic;

    @PostMapping()
    public void createAddress(@RequestBody Address address) {
        addressLogic.createAddress(address);

    }
}
