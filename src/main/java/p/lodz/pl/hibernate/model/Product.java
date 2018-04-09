package p.lodz.pl.hibernate.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private ProductCategory productCategory;

    public Product() {
    }

    public Product(String name, Cart cart, ProductCategory productCategory) {
        this.name = name;
        this.cart = cart;
        this.productCategory = productCategory;
    }


}
