package com.example.product.dto;

import com.example.product.entity.MaritalStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private MaritalStatus maritalStatus;
}