package com.example.product.entity;

import jakarta.validation.constraints.NotNull;

import java.util.Arrays;

public enum MaritalStatus{
    SINGLE,
    MARRIED,
    DIVORCED,
    WIDOWED;

    public static MaritalStatus from(@NotNull String value) {
        return Arrays.stream(values())
                .filter(v -> v.name().equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("Invalid marital status: " + value));
    }
}
