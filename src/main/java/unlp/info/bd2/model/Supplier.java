package unlp.info.bd2.model;

import java.util.List;
@Entity
public class Supplier {
    @ID
    private Long id;
    @Column(name = "businessName", nullable = false, unique=true)
    private String businessName;
    @Column(name = "authorizationNumber", nullable = false, unique=true)
    private String authorizationNumber;

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
