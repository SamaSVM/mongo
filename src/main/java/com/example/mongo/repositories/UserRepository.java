package com.example.mongo.repositories;

import com.example.mongo.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    List<UserEntity> findByFirstName(String s);
}

