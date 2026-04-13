package unlp.info.bd2.model;

@Entity
public class Stop {
    @ID
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "Desc", nullable = true, length= 500)
    private String description;


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
