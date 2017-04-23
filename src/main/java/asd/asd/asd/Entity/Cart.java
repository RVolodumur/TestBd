package asd.asd.asd.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean buy = false;
    //private ???? buyTime;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "user_cart"
            ,joinColumns = @JoinColumn(name = "carts_id")
                ,inverseJoinColumns = @JoinColumn(name = "User_id"))
    private User user;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "cart_product"
            , joinColumns = @JoinColumn(name = "Cart_id")
                ,inverseJoinColumns = @JoinColumn(name = "products_id"))
    List<Product> products = new ArrayList<Product>();

    public Cart() {
    }

    public Cart(boolean buy, User user, List<Product> products) {
        this.buy = buy;
        this.user = user;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBuy() {
        return buy;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", buy=" + buy +
                '}';
    }
}

