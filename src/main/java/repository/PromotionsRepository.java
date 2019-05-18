package repository;

import entity.PromotionsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionsRepository extends 
            CrudRepository<PromotionsEntity,Integer>{
    
}
