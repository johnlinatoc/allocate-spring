package com.project.allocate.controller;

import com.project.allocate.model.User;
import com.project.allocate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class UserController {
    final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public String getUser() {
        return "<h1>Welcome User</h1>";
    }

    @GetMapping("/users")
    public Collection<User> getUsers () {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        return "user created";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "<h1>Welcome Admin</h1>";
    }
}
