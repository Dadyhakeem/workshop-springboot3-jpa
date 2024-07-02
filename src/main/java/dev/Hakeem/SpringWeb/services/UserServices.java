package dev.Hakeem.SpringWeb.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.Hakeem.SpringWeb.entities.User;
import dev.Hakeem.SpringWeb.repository.UserRepository;
@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User>findAll()
    {
        return userRepository.findAll();
    }

    public User findById(Long id)
    {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
