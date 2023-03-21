package com.example.mongo.controllers;

import com.example.mongo.entities.UserEntity;
import com.example.mongo.requests.UserRequest;
import com.example.mongo.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public final class UserController {
    private final UserService userService;

    @PostMapping
    public void findAll(@Valid @RequestBody final UserRequest userRequest) {
        userService.save(userRequest);
    }

    @GetMapping
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{firstName}")
    public List<UserEntity> findByFirstName(@PathVariable final String firstName) {
        return userService.finByFirstName(firstName);
    }
}
