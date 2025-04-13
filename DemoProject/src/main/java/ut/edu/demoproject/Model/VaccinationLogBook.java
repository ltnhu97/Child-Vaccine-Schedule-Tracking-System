package ut.edu.demoproject.Model;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "VaccinationLogBook")
public class VaccinationLogBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long VaccinationLogBookID;
    private Long ChildID;
    private String UseVaccine;
    private Date VaccinationDate;
    private String notes;

    // Contructor:

    public VaccinationLogBook(String useVaccine, Date vaccinationDate, String notes) {
        UseVaccine = useVaccine;
        VaccinationDate = vaccinationDate;
        this.notes = notes;
    }

    public VaccinationLogBook() {
    }

    //Getter:

    public Long getVaccinationLogBookID() {
        return VaccinationLogBookID;
    }

    public Long getChildID() {
        return ChildID;
    }

    public String getUseVaccine() {
        return UseVaccine;
    }

    public String getNotes() {
        return notes;
    }

    public Date getVaccinationDate() {
        return VaccinationDate;
    }

    // Setter:

    public void setVaccinationLogBookID(Long vaccinationLogBookID) {
        VaccinationLogBookID = vaccinationLogBookID;
    }

    public void setChildID(Long childID) {
        ChildID = childID;
    }

    public void setUseVaccine(String useVaccine) {
        UseVaccine = useVaccine;
    }

    public void setVaccinationDate(Date vaccinationDate) {
        VaccinationDate = vaccinationDate;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
