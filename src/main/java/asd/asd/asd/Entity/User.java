package asd.asd.asd.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String phone;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   @JoinTable(name = "user_cart"
            ,joinColumns = @JoinColumn(name = "User_id")
                ,inverseJoinColumns = @JoinColumn(name = "carts_id"))
    List<Cart> carts = new ArrayList<Cart>();
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
//    @JoinTable()
    List<Comment> comments = new ArrayList<Comment>();

    public User() {
    }

    public User(String userName) {
        this.userName = userName;

    }

    public User(String userName, String phone, String email, String password) {
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
