package ut.edu.childvaccine.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;


@Getter
@Setter
public class Vaccinees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vaccineId;
    private String VaccineName;
    private String lotNumber;
    private char manufacturer;
    private String ageGroup;
    private DecimalFormat priceOne;
    private Boolean conditionOfVaccine;

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public Boolean getConditionOfVaccine() {
        return conditionOfVaccine;
    }

    public void setConditionOfVaccine(Boolean conditionOfVaccine) {
        this.conditionOfVaccine = conditionOfVaccine;
    }

    public DecimalFormat getPriceOne() {
        return priceOne;
    }

    public void setPriceOne(DecimalFormat priceOne) {
        this.priceOne = priceOne;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public char getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(char manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getVaccineName() {
        return VaccineName;
    }

    public void setVaccineName(String vaccineName) {
        VaccineName = vaccineName;
    }
}
