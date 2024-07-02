package dev.Hakeem.SpringWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import dev.Hakeem.SpringWeb.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

    

    
}
