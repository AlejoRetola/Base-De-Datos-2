package unlp.info.bd2.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "businessName", nullable = false, unique=true)
    private String businessName;
    @Column(name = "authorizationNumber", nullable = false, unique=true)
    private String authorizationNumber;
    @OneToMany(mappedBy = "supplier" , cascade = {CascadeType.MERGE,  CascadeType.PERSIST})
    private List<Service> services;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

}
