package unlp.info.bd2.model;


import java.util.List;
@Entity
public class DriverUser extends User {
    @Column(name = expediente, nullable = false)
    private String expedient;

    private List<Route> routes;

    public String getExpedient() {
        return expedient;
    }

    public void setExpedient(String expedient) {
        this.expedient = expedient;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRouts(List<Route> routs) {
        this.routes = routs;
    }
}
