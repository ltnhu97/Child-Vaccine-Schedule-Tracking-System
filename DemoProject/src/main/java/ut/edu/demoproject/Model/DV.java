package ut.edu.demoproject.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "Repair")
public class DV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ServiceName;
    private String Description;
    private double Price;

    // Contructor

    public DV(String serviceName, String description, double price) {
        ServiceName = serviceName;
        Description = description;
        Price = price;
    }

    public DV() {
    }

    // Getter:

    public String getServiceName() {
        return ServiceName;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public Long getId() {
        return id;
    }

    // Setter:

    public void setId(Long id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
