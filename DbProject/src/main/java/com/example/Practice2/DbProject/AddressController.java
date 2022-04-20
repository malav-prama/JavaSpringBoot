package com.example.Practice2.DbProject;
import com.example.Practice2.DbProject.AddressLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/address")

public class AddressController {

    @Autowired
    AddressLogic addressLogic;
    @PostMapping()
    public void createAddress(@RequestBody Address address)  {
        addressLogic.createAddress(address);
    }


}
