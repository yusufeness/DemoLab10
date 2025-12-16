package com.example.demo.controller;

import com.example.demo.dto.CreateUserRequest;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    // Basit GET endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello, user!";
    }

    // Kullanıcı oluşturma endpoint
    @PostMapping("/users")
    public User createUser(@RequestBody CreateUserRequest req) {
        return userService.createUser(req);
    }

    // Kullanıcı login endpoint
    @PostMapping("/login")
    public String login(@RequestBody CreateUserRequest req) {
        boolean success = userService.authenticate(req.getEmail(), req.getPassword());
        return success ? "Login successful" : "Invalid credentials";
    }
}
