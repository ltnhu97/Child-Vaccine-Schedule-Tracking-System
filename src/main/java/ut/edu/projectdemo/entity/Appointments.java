package ut.edu.projectdemo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "appointments")
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long childId;
    private Date appointmentDate;
    private String status;

    // Getters:

    public Long getId() {
        return id;
    }

    public Long getChildId() {
        return childId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    // Setters:

    public void setId(Long id) {
        this.id = id;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
