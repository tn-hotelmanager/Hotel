
package entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Rooms")
public class RoomsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="RoomId")
    private int roomId;
    @Column(name="RoomName")
    private String roomName;
    @Column(name="RoomDescription")
    private String roomDescription;
    @Column(name="RoomPrice")
    private double roomPrice;
    @Column(name="RoomNumberBed")
    private int roomNumberBed;
    
    @OneToMany(mappedBy = "room", fetch = FetchType.EAGER)
    private List<PromotionDetailsEntity> promotionDetailsList;
    
    @OneToOne(cascade = CascadeType.ALL)
    private BookingDetailsEntity bookingDetails;

    public RoomsEntity() {
    }

    public RoomsEntity(int roomId, String roomName, String roomDescription, double roomPrice, int roomNumberBed, List<PromotionDetailsEntity> promotionDetailsList, BookingDetailsEntity bookingDetails) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.roomPrice = roomPrice;
        this.roomNumberBed = roomNumberBed;
        this.promotionDetailsList = promotionDetailsList;
        this.bookingDetails = bookingDetails;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomNumberBed() {
        return roomNumberBed;
    }

    public void setRoomNumberBed(int roomNumberBed) {
        this.roomNumberBed = roomNumberBed;
    }

    public List<PromotionDetailsEntity> getPromotionDetailsList() {
        return promotionDetailsList;
    }

    public void setPromotionDetailsList(List<PromotionDetailsEntity> promotionDetailsList) {
        this.promotionDetailsList = promotionDetailsList;
    }

    public BookingDetailsEntity getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(BookingDetailsEntity bookingDetails) {
        this.bookingDetails = bookingDetails;
    }
    
    
}
