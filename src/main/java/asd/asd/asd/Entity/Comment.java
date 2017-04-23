package asd.asd.asd.Entity;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String textComment;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User user;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Product products;

    public Comment() {
    }

    public Comment(String textComment, User user, Product product) {
        this.textComment = textComment;
        this.user = user;
        this.products = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return products;
    }

    public void setProduct(Product product) {
        this.products = product;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", textComment='" + textComment + '\'' +
                ", user=" + user +
                '}';
    }
}
