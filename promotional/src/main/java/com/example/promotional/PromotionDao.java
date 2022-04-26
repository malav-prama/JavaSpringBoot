package com.example.promotional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class PromotionDao {

    @Autowired
    PromotionRepository promotionRepository;

    public void saveUser(Promotion promotion){
        promotionRepository.save(promotion);
    }



    public Promotion getPromotion(int id)
    {
        return promotionRepository.findById(id).get();
    }

}
