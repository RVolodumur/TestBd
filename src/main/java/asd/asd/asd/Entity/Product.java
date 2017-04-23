package asd.asd.asd.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private String description;
    private String fotoUrl;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Category category;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "products")
    private List<Comment> comments = new ArrayList<Comment>();
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "cart_product"
            ,joinColumns = @JoinColumn(name = "products_id")
                ,inverseJoinColumns = @JoinColumn(name = "Cart_id"))
    private Cart cart;

    public Product() {
    }

    public Product(String productName, String description, String fotoUrl, Category category) {
        this.productName = productName;
        this.description = description;
        this.fotoUrl = fotoUrl;
        this.category = category;
    }


//    public Product(String productName, String description, Category category, List<Comment> comments, Cart cart) {
//        this.productName = productName;
//        this.description = description;
//        this.category = category;
//        this.comments = comments;
//        this.cart = cart;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
