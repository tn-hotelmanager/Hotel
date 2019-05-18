
package entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="PromotionDetails")
public class PromotionDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PromotionDetailsId")
    private int promotionDetailsId;
    @Column(name="PromotionDetailsStart")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate promotionDetailsStart;
    @Column(name="PromotionDetailsEnd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate promotionDetailsEnd;
    
    @ManyToOne
    @JoinColumn(name = "RoomId")
    private RoomsEntity room;
    
    @ManyToOne
    @JoinColumn(name = "PromotionsId")
    private RoomsEntity promotions;

    public PromotionDetailsEntity() {
    }

    public PromotionDetailsEntity(int promotionDetailsId, LocalDate promotionDetailsStart, LocalDate promotionDetailsEnd, RoomsEntity room, RoomsEntity promotions) {
        this.promotionDetailsId = promotionDetailsId;
        this.promotionDetailsStart = promotionDetailsStart;
        this.promotionDetailsEnd = promotionDetailsEnd;
        this.room = room;
        this.promotions = promotions;
    }

    public int getPromotionDetailsId() {
        return promotionDetailsId;
    }

    public void setPromotionDetailsId(int promotionDetailsId) {
        this.promotionDetailsId = promotionDetailsId;
    }

    public LocalDate getPromotionDetailsStart() {
        return promotionDetailsStart;
    }

    public void setPromotionDetailsStart(LocalDate promotionDetailsStart) {
        this.promotionDetailsStart = promotionDetailsStart;
    }

    public LocalDate getPromotionDetailsEnd() {
        return promotionDetailsEnd;
    }

    public void setPromotionDetailsEnd(LocalDate promotionDetailsEnd) {
        this.promotionDetailsEnd = promotionDetailsEnd;
    }

    public RoomsEntity getRoom() {
        return room;
    }

    public void setRoom(RoomsEntity room) {
        this.room = room;
    }

    public RoomsEntity getPromotions() {
        return promotions;
    }

    public void setPromotions(RoomsEntity promotions) {
        this.promotions = promotions;
    }
    
    
}
