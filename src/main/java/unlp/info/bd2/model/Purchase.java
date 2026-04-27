package unlp.info.bd2.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code", nullable = false, unique=true)
    private String code;
    @Column(name = "totalPrice", nullable = false)
    private float totalPrice;
    @Column(name = "date", nullable = false)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "route_id" , nullable = false)
    private Route route;
    @OneToOne(mappedBy = "purchase" , cascade = {CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST} , orphanRemoval = true) // Supongo que es necesario por si se permite borrar reseñas
    private Review review;
    @OneToMany(mappedBy = "purchase" , cascade = {CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST} , orphanRemoval = true)
    private List<ItemService> itemServiceList;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public List<ItemService> getItemServiceList() {
        return itemServiceList;
    }

    public void setItemServiceList(List<ItemService> itemServiceList) {
        this.itemServiceList = itemServiceList;
    }
}
