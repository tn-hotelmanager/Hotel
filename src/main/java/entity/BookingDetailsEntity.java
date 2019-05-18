
package entity;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="BookingDetails")
public class BookingDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BookingDetailsId")
    private int bookingDetailsId;
    @Column(name="BookingDetailsStart")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bookingDetailsStart;
    @Column(name="BookingDetailsEnd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bookingDetailsEnd;

    @ManyToOne
    @JoinColumn(name = "BookingsId")
    private BookingsEntity booking;
    
    @OneToOne(mappedBy = "bookingDetails")
    @JoinColumn(name = "RoomId")
    private RoomsEntity room;
    
    @OneToOne(cascade = CascadeType.ALL)
    private ServiceDetailsEntity serviceDetails;
    
    public BookingDetailsEntity() {
    }

    public BookingDetailsEntity(int bookingDetailsId, LocalDate bookingDetailsStart, LocalDate bookingDetailsEnd, BookingsEntity booking, RoomsEntity room, ServiceDetailsEntity serviceDetails) {
        this.bookingDetailsId = bookingDetailsId;
        this.bookingDetailsStart = bookingDetailsStart;
        this.bookingDetailsEnd = bookingDetailsEnd;
        this.booking = booking;
        this.room = room;
        this.serviceDetails = serviceDetails;
    }

    public int getBookingDetailsId() {
        return bookingDetailsId;
    }

    public void setBookingDetailsId(int bookingDetailsId) {
        this.bookingDetailsId = bookingDetailsId;
    }

    public LocalDate getBookingDetailsStart() {
        return bookingDetailsStart;
    }

    public void setBookingDetailsStart(LocalDate bookingDetailsStart) {
        this.bookingDetailsStart = bookingDetailsStart;
    }

    public LocalDate getBookingDetailsEnd() {
        return bookingDetailsEnd;
    }

    public void setBookingDetailsEnd(LocalDate bookingDetailsEnd) {
        this.bookingDetailsEnd = bookingDetailsEnd;
    }

    public BookingsEntity getBooking() {
        return booking;
    }

    public void setBooking(BookingsEntity booking) {
        this.booking = booking;
    }

    public RoomsEntity getRoom() {
        return room;
    }

    public void setRoom(RoomsEntity room) {
        this.room = room;
    }

    public ServiceDetailsEntity getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(ServiceDetailsEntity serviceDetails) {
        this.serviceDetails = serviceDetails;
    }
  
}
