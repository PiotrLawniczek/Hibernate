package p.lodz.pl.hibernate.model;


import javax.persistence.*;

@Entity
public class Product {
    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private ProductCategory productCategory;


    public Product(String name, Cart cart, ProductCategory productCategory) {
        this.name = name;
        this.cart = cart;
        this.productCategory = productCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
