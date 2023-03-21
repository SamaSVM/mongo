package com.example.mongo.requests;

import jakarta.validation.constraints.NotNull;

public record UserRequest (@NotNull String firstName, @NotNull String lastName){
}
