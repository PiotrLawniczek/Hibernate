package p.lodz.pl.hibernate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "productCategory")
    private Set<Product> product;

    public ProductCategory() {
    }

    public ProductCategory(String name) {
        this.name = name;
    }


}
