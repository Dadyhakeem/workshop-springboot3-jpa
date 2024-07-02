package dev.Hakeem.SpringWeb.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.Hakeem.SpringWeb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findALL()
    {
        User users = new User(1L, "dady", "dady@gmail.com", "57590304", "12345");
        return ResponseEntity.ok().body(users);
    }
}
