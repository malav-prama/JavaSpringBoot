package com.example.promotional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PromotionRepository extends CrudRepository<Promotion, Integer> {
}
