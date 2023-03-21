package com.example.mongo.services;

import com.example.mongo.entities.UserEntity;
import com.example.mongo.repositories.UserRepository;
import com.example.mongo.requests.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public final class UserService {
    private final UserRepository userRepository;

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public void save(UserRequest userRequest) {
        final var user = new UserEntity();
        user.setFirstName(userRequest.firstName());
        user.setLastName(userRequest.lastName());
        userRepository.save(user);
    }
}
