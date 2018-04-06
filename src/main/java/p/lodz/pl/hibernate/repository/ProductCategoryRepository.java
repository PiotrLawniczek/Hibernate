package p.lodz.pl.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import p.lodz.pl.hibernate.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
