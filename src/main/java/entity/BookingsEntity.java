
package entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Bookings")
public class BookingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BookingsId")
    private int bookingsId;
    @Column(name="BookingsName")
    private String bookingsName;
    @Column(name="BookingsEmail")
    private String bookingsEmail;
    @Column(name="BookingsPhone")
    private String bookingsPhone;
    @Column(name="BookingsNumberOfPeople")
    private int bookingsNumberOfPeople;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private CustomerEntity customer;
    
    @OneToMany(mappedBy = "booking")
    private List<BookingDetailsEntity> bookingDetailsList;
    
    public BookingsEntity() {
    }

    public BookingsEntity(int bookingsId, String bookingsName, String bookingsEmail, String bookingsPhone, int bookingsNumberOfPeople, CustomerEntity customer, List<BookingDetailsEntity> bookingDetailsList) {
        this.bookingsId = bookingsId;
        this.bookingsName = bookingsName;
        this.bookingsEmail = bookingsEmail;
        this.bookingsPhone = bookingsPhone;
        this.bookingsNumberOfPeople = bookingsNumberOfPeople;
        this.customer = customer;
        this.bookingDetailsList = bookingDetailsList;
    }

    public int getBookingsId() {
        return bookingsId;
    }

    public void setBookingsId(int bookingsId) {
        this.bookingsId = bookingsId;
    }

    public String getBookingsName() {
        return bookingsName;
    }

    public void setBookingsName(String bookingsName) {
        this.bookingsName = bookingsName;
    }

    public String getBookingsEmail() {
        return bookingsEmail;
    }

    public void setBookingsEmail(String bookingsEmail) {
        this.bookingsEmail = bookingsEmail;
    }

    public String getBookingsPhone() {
        return bookingsPhone;
    }

    public void setBookingsPhone(String bookingsPhone) {
        this.bookingsPhone = bookingsPhone;
    }

    public int getBookingsNumberOfPeople() {
        return bookingsNumberOfPeople;
    }

    public void setBookingsNumberOfPeople(int bookingsNumberOfPeople) {
        this.bookingsNumberOfPeople = bookingsNumberOfPeople;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public List<BookingDetailsEntity> getBookingDetailsList() {
        return bookingDetailsList;
    }

    public void setBookingDetailsList(List<BookingDetailsEntity> bookingDetailsList) {
        this.bookingDetailsList = bookingDetailsList;
    }
    
    
}
