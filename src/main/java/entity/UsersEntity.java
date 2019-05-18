
package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UsersId")
    private int usersId;
    @Column(name="UsersName")
    private String usersName;
    @Column(name="UsersEmail")
    private String usersEmail;
    @Column(name="UsersPhone")
    private String usersPhone;
    @Column(name="UsersPass")
    private String usersPass;
    @Column(name="UsersRole")
    private String usersRole;
    
    @OneToOne(cascade = CascadeType.ALL)
    private CustomerEntity usersCustomer;

    public UsersEntity() {
    }

    public UsersEntity(int usersId, String usersName, String usersEmail, String usersPhone, String usersPass, String usersRole, CustomerEntity usersCustomer) {
        this.usersId = usersId;
        this.usersName = usersName;
        this.usersEmail = usersEmail;
        this.usersPhone = usersPhone;
        this.usersPass = usersPass;
        this.usersRole = usersRole;
        this.usersCustomer = usersCustomer;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail;
    }

    public String getUsersPhone() {
        return usersPhone;
    }

    public void setUsersPhone(String usersPhone) {
        this.usersPhone = usersPhone;
    }

    public String getUsersPass() {
        return usersPass;
    }

    public void setUsersPass(String usersPass) {
        this.usersPass = usersPass;
    }

    public String getUsersRole() {
        return usersRole;
    }

    public void setUsersRole(String usersRole) {
        this.usersRole = usersRole;
    }

    public CustomerEntity getUsersCustomer() {
        return usersCustomer;
    }

    public void setUsersCustomer(CustomerEntity usersCustomer) {
        this.usersCustomer = usersCustomer;
    }

    
}
