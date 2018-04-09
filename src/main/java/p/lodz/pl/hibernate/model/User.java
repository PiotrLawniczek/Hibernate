package p.lodz.pl.hibernate.model;


import lombok.Data;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tuser")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String postalCode;
    private String city;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<UserRole> userRole = new HashSet<>();


    public User() {
    }

    public User(String firstName, String lastName, String phone, String email, String postalCode, String city, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.postalCode = postalCode;
        this.city = city;
        this.address = address;

    }




}
