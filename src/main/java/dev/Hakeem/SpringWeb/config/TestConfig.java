package dev.Hakeem.SpringWeb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import dev.Hakeem.SpringWeb.entities.Category;
import dev.Hakeem.SpringWeb.entities.Order;
import dev.Hakeem.SpringWeb.entities.Product;
import dev.Hakeem.SpringWeb.entities.User;
import dev.Hakeem.SpringWeb.entities.enums.OrderStatus;
import dev.Hakeem.SpringWeb.repository.CategoryRepository;
import dev.Hakeem.SpringWeb.repository.OrderRepository;
import dev.Hakeem.SpringWeb.repository.ProductRepository;
import dev.Hakeem.SpringWeb.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;
   @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository products;

    @Override
    public void run(String... args) throws Exception {




        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 

        products.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
         
        Category cat1 = new Category(null, "Eletronicos");
        Category cat3 = new Category(null, "Computers");
        Category cat2 = new Category(null, "Books");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

        // associacao das tabelas
        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);
      
        products.saveAll(Arrays.asList(p1,p2,p3,p4,p5));



        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");  

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),u2,OrderStatus.DELIVERED); 
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),u1,OrderStatus.DELIVERED);
        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
