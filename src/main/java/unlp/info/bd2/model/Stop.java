package unlp.info.bd2.model;

import jakarta.persistence.*;

@Entity
public class Stop {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "Desc", nullable = true, length= 500)
    private String description;

    //ACA AGREGO EL ROUTE PORQUE NO HAY NADA, OQUE HAGO AAAAAAAAAAAAAAAA
    @ManyToOne
    @JoinColumn( name = "route_id")
    private Route route;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
