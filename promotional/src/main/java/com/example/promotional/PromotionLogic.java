package com.example.promotional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PromotionLogic {

    @Autowired
    PromotionDao PromotionDao;


    public void createPromotion(Promotion promotion)  {
        PromotionDao.savePromotion(promotion);
    }



    public Promotion getPromotion(Integer id)
    {
        return promotionDao.getPromotion(id);
    }
}