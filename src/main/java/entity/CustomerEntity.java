
package entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CustomerId")
    private int customerId;
    @Column(name="CustomerName")
    private String customerName;
    @Column(name="CustomerEmail")
    private String customerEmail;
    @Column(name="CustomerPhone")
    private String customerPhone;
    @Column(name="CustomerPass")
    private String customerPass;
    
    @OneToOne(mappedBy = "usersCustomer")
    @JoinColumn(name = "UserID")
    private UsersEntity  usersId;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<BookingsEntity> bookingList;
    
    public CustomerEntity() {
    }

    public CustomerEntity(int customerId, String customerName, String customerEmail, String customerPhone, String customerPass, UsersEntity usersId, List<BookingsEntity> bookingList) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerPass = customerPass;
        this.usersId = usersId;
        this.bookingList = bookingList;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public UsersEntity getUsersId() {
        return usersId;
    }

    public void setUsersId(UsersEntity usersId) {
        this.usersId = usersId;
    }

    public List<BookingsEntity> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<BookingsEntity> bookingList) {
        this.bookingList = bookingList;
    }
    
    
}
