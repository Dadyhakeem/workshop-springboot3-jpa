package dev.Hakeem.SpringWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.Hakeem.SpringWeb.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
