package unlp.info.bd2.model;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Service {
    @ID
    @NotNull
    private Long id;

    @NotNull
    @Column (unique = true)
    @Size(max=100, message= "El nombre como maximo puede tener 100 characters")
    private String name;
    @NotNull
    private float price;

    private String description;

    private List<ItemService> itemServiceList;

    private Supplier supplier;


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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ItemService> getItemServiceList() {
        return itemServiceList;
    }

    public void setItemServiceList(List<ItemService> itemServiceList) {
        this.itemServiceList = itemServiceList;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
