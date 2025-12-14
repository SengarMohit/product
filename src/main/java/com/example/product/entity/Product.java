package com.example.product.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

import java.util.Map;

@Document(collection = "product")
@Getter
@Setter
public class Product {
    @Id
    private String id;

    @NotBlank
    private String name;
    // Any additional properties
    private Map<String, Object> attributes;
}

