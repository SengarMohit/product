package com.example.product.dto;

import com.example.product.entity.User;
import com.example.product.entity.MaritalStatus;

public class UserMapper {

    public static User toEntity(UserRequestDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setMaritalStatus(MaritalStatus.from(dto.getMaritalStatus()));
        return user;
    }

    public static UserResponseDTO toResponse(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(Long.valueOf(user.getUserId()));
        dto.setName(user.getName());
        //dto.setEmail(user.getEmail());
        //dto.setPhone(user.getPhone());
        dto.setMaritalStatus(user.getMaritalStatus());
        return dto;
    }
}
