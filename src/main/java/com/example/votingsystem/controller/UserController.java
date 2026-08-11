package com.example.votingsystem.controller;

import com.example.votingsystem.model.User;
import com.example.votingsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }
}