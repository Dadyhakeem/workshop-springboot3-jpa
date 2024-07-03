package dev.Hakeem.SpringWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.Hakeem.SpringWeb.entities.OrderItem;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Long>{

    

    
}
