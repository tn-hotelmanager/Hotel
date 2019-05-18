package repository;

import entity.RoomsEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends 
        CrudRepository<RoomsEntity,Integer>{
        @Query(value = "Select * From Rooms  " +
"Where RoomName like ?1 and RoomNumberBed = ?2  " +
"and RoomId not in (Select distinct RoomId From BookingDetails  " +
"where BookingDetailsStart >= ?3 and BookingDetailsEnd <= ?4)" , nativeQuery = true)
        List<RoomsEntity> searchRoomsBooking(String room, int numberBed, LocalDate searchStart, LocalDate searchEnd);
        
}
