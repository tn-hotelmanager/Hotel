package repository;

import entity.BookingDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<BookingDetailsEntity, Integer>{
    
}
