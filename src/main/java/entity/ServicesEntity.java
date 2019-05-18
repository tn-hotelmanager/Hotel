
package entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Services")
public class ServicesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ServicesId")
    private int servicesId;
    @Column(name="ServicesName")
    private String servicesName;
    @Column(name="ServicesDescription")
    private String servicesDescription;
    @Column(name="ServicePrice")
    private double servicePrice;

    @OneToMany(mappedBy = "")
    private List<ServiceDetailsEntity> serviceDetailsList;
    
    public ServicesEntity() {
    }

    public ServicesEntity(int servicesId, String servicesName, String servicesDescription, double servicePrice, List<ServiceDetailsEntity> serviceDetailsList) {
        this.servicesId = servicesId;
        this.servicesName = servicesName;
        this.servicesDescription = servicesDescription;
        this.servicePrice = servicePrice;
        this.serviceDetailsList = serviceDetailsList;
    }

    public int getServicesId() {
        return servicesId;
    }

    public void setServicesId(int servicesId) {
        this.servicesId = servicesId;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getServicesDescription() {
        return servicesDescription;
    }

    public void setServicesDescription(String servicesDescription) {
        this.servicesDescription = servicesDescription;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public List<ServiceDetailsEntity> getServiceDetailsList() {
        return serviceDetailsList;
    }

    public void setServiceDetailsList(List<ServiceDetailsEntity> serviceDetailsList) {
        this.serviceDetailsList = serviceDetailsList;
    }
    
    
}
