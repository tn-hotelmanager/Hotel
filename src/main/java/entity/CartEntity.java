package entity;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class CartEntity {
    
    private List<BookingDetailsEntity> bookingDetailsList = new ArrayList<BookingDetailsEntity>();
    //constructors

    public CartEntity() {
    }
    
    //getters and setter

    public List<BookingDetailsEntity> getBookingDetailsList() {
        return bookingDetailsList;
    }

    public void setBookingDetailsList(List<BookingDetailsEntity> bookingDetailsList) {
        this.bookingDetailsList = bookingDetailsList;
    }

}
