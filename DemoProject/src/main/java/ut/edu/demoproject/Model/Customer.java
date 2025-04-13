package ut.edu.demoproject.Model;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String PhoneNumber;
    private String FullName;
    private String Email;
    private Date DateOfBirth;

    // Contructor:

    public Customer(Date dateOfBirth, String phoneNumber, String fullName, String email) {
        DateOfBirth = dateOfBirth;
        PhoneNumber = phoneNumber;
        FullName = fullName;
        Email = email;
    }

    public Customer() {
    }

    // Getter:

    public Long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public String getEmail() {
        return Email;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    // Setter:


    public void setId(Long id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
