package com.example.promotional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3/promotion")


public class PromotionController {

    @Autowired
    PromotionLogic promotionLogic;
    @PostMapping()
    public void createAddress(@RequestBody Promotion promotion)  {
        promotionLogic.createPromotion(promotion);
    }

    @GetMapping("/{id}")
    public Promotion getPromotion(@PathVariable("id") Integer id) {
        return  PromotionLogic.getPromotion(id);

    }


}
