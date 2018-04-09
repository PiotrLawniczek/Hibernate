package p.lodz.pl.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import p.lodz.pl.hibernate.model.*;
import p.lodz.pl.hibernate.repository.*;

@Component
public class DataLoader implements ApplicationRunner {


    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;
    private CartRepository cartRepository;
    private ProductRepository productRepository;
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    public DataLoader(UserRepository userRepository, UserRoleRepository userRoleRepository, CartRepository cartRepository, ProductRepository productRepository, ProductCategoryRepository productCategoryRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this.productCategoryRepository = productCategoryRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        UserRole adminRole = userRoleRepository.save(new UserRole("ROLE_ADMIN"));
        UserRole userRole = userRoleRepository.save(new UserRole("ROLE_USER"));


        User user1 = new User("Piotr", "Lawniczek", "123456789", "piotr@o2.pl", "00-000", "Lodz", "Piotrkowska 22");
        user1.getUserRole().add(userRoleRepository.findByRole(adminRole.getRole()));
        user1.getUserRole().add(userRoleRepository.findByRole(userRole.getRole()));

        user1 = userRepository.save(user1);
        Cart cart1 = cartRepository.save(new Cart(user1));
        user1.setCart(cart1);
        userRepository.save(user1);


        User user2 = new User("Andrzej", "Kosny", "987654321", "andrzej@gmail.com", "99-999", "Poznan", "Kopernika 22");
        user2.getUserRole().add(userRoleRepository.findByRole(userRole.getRole()));

        user2 = userRepository.save(user2);
        Cart cart2 = cartRepository.save(new Cart(user2));
        user2.setCart(cart2);
        userRepository.save(user2);


        ProductCategory productCategory1 = productCategoryRepository.save(new ProductCategory("Telephone"));
        ProductCategory productCategory2 = productCategoryRepository.save(new ProductCategory("Screen"));

        Product product1 = productRepository.save(new Product("Samsung", cart1, productCategory1));
        Product product2 = productRepository.save(new Product("HP", null, productCategory2));

        Product product3 = productRepository.save(new Product("Nokia", cart1, productCategory1));
        Product product4 = productRepository.save(new Product("Dell", cart1, productCategory2));


        /*User user3 = new User("Kamil", "AS", "34563", "asdf@gmail.com", "99-999", "Poznan", "Kopernika 25");
        user3.getUserRole().add(userRoleRepository.findByRole(userRole.getRole()));
        userRepository.save(user3);*/

        System.out.println("generate");
    }
}
