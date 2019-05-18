package repository;

import entity.ServicesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends 
            CrudRepository<ServicesEntity,Integer>{
    
}
