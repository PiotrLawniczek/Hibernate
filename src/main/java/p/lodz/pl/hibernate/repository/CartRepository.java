package p.lodz.pl.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import p.lodz.pl.hibernate.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
