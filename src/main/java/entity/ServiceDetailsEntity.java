
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ServiceDetails")
public class ServiceDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ServiceDetailsId")
    private int serviceDetailsId;
    @Column(name="ServiceDetailsQuantity")
    private int serviceDetailsQuantity;

    @OneToOne(mappedBy = "serviceDetails")
    @JoinColumn(name ="BookingDetailsId")
    private BookingDetailsEntity bookingDetails;
    
    public ServiceDetailsEntity() {
    }

    public ServiceDetailsEntity(int serviceDetailsId, int serviceDetailsQuantity, BookingDetailsEntity bookingDetails) {
        this.serviceDetailsId = serviceDetailsId;
        this.serviceDetailsQuantity = serviceDetailsQuantity;
        this.bookingDetails = bookingDetails;
    }

    public int getServiceDetailsId() {
        return serviceDetailsId;
    }

    public void setServiceDetailsId(int serviceDetailsId) {
        this.serviceDetailsId = serviceDetailsId;
    }

    public int getServiceDetailsQuantity() {
        return serviceDetailsQuantity;
    }

    public void setServiceDetailsQuantity(int serviceDetailsQuantity) {
        this.serviceDetailsQuantity = serviceDetailsQuantity;
    }

    public BookingDetailsEntity getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(BookingDetailsEntity bookingDetails) {
        this.bookingDetails = bookingDetails;
    }
    
}
