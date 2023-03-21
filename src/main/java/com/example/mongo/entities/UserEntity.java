package com.example.mongo.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class UserEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
