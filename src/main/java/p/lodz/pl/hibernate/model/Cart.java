package p.lodz.pl.hibernate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "cart")
    private Set<Product> products = new HashSet<>();

    public Cart() {
    }
    public Cart(User user) {
        this.user = user;
    }



}
