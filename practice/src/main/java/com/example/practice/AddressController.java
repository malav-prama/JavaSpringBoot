package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/address")

public class AddressController {
@Autowired
AddressLogic addressLogic;
    @PostMapping()
    public void createAddress(@RequestBody Address address)  {
        addressLogic.createAddress(address);
  }

  @PutMapping("/{id}")
    public void updateUser(@RequestBody Address address, @PathVariable("id") Integer id)
  {      address.setId(id);
      //todo: exception handling when id in path and body do not match
      addressLogic.updateAddress(address);

  }


        @GetMapping("/{id}")
        public Address getAddress(@PathVariable("id") Integer id) {
            return  addressLogic.getAddress(id);

        }


    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Integer id)
    {
       addressLogic.deleteAddress(id);
    }

    public void setAddressLogic(AddressLogic addressLogic){
        this.addressLogic = addressLogic;
    }
}
