package com.example.promotional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class PromotionDao {

    @Autowired
    PromotionRepository promotionRepository;

    public void saveUser(Promotion promotion){
       Promotion dbPromotion = promotionRepository.save(promotion);
        System.out.println(dbPromotion.getId());
    }



    public Promotion getPromotion(int id)
    {
        return promotionRepository.findById(id).get();
    }

}
