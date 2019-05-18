
package entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Promotions")
public class PromotionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PromotionsId")
    private int promotionsId;
    @Column(name="PromotionsName")
    private String promotionsName;
    @Column(name="promotionsDescription")
    private String promotionsDescription;
    @Column(name="PromotionsValue")
    private String promotionsValue;
    
    @OneToMany(mappedBy = "promotions", fetch = FetchType.EAGER)
    private List<PromotionDetailsEntity> promotionDetailsList;

    public PromotionsEntity() {
    }

    public PromotionsEntity(int promotionsId, String promotionsName, String promotionsDescription, String promotionsValue, List<PromotionDetailsEntity> promotionDetailsList) {
        this.promotionsId = promotionsId;
        this.promotionsName = promotionsName;
        this.promotionsDescription = promotionsDescription;
        this.promotionsValue = promotionsValue;
        this.promotionDetailsList = promotionDetailsList;
    }

    public int getPromotionsId() {
        return promotionsId;
    }

    public void setPromotionsId(int promotionsId) {
        this.promotionsId = promotionsId;
    }

    public String getPromotionsName() {
        return promotionsName;
    }

    public void setPromotionsName(String promotionsName) {
        this.promotionsName = promotionsName;
    }

    public String getPromotionsDescription() {
        return promotionsDescription;
    }

    public void setPromotionsDescription(String promotionsDescription) {
        this.promotionsDescription = promotionsDescription;
    }

    public String getPromotionsValue() {
        return promotionsValue;
    }

    public void setPromotionsValue(String promotionsValue) {
        this.promotionsValue = promotionsValue;
    }

    public List<PromotionDetailsEntity> getPromotionDetailsList() {
        return promotionDetailsList;
    }

    public void setPromotionDetailsList(List<PromotionDetailsEntity> promotionDetailsList) {
        this.promotionDetailsList = promotionDetailsList;
    }
    
    
}
