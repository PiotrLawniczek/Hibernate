package p.lodz.pl.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import p.lodz.pl.hibernate.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
