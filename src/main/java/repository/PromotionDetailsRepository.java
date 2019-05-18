package repository;


import entity.PromotionDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionDetailsRepository extends 
            CrudRepository<PromotionDetailsEntity,Integer>{
    
}
