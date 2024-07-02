package dev.Hakeem.SpringWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.Hakeem.SpringWeb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    
}
