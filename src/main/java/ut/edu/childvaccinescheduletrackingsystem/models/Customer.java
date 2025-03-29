package ut.edu.childvaccinescheduletrackingsystem.models;

import jakarta.persistence.*;
import java.util.List;
import ut.edu.childvaccinescheduletrackingsystem.models.VaccinationRecord;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String registrationDate;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<VaccinationRecord> vaccinationRecords;

    @Override
    public String toString() {
        return "Customer{" +
                "registrationDate='" + registrationDate + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<VaccinationRecord> getVaccinationRecords() {
        return vaccinationRecords;
    }

    public void setVaccinationRecords(List<VaccinationRecord> vaccinationRecords) {
        this.vaccinationRecords = vaccinationRecords;
    }
}
