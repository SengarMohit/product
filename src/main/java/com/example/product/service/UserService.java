package com.example.product.service;

import com.example.product.dto.UserMapper;
import com.example.product.dto.UserRequestDTO;
import com.example.product.dto.UserResponseDTO;
import com.example.product.entity.User;
import com.example.product.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {


    private UserRepository userRepository;

    public UserResponseDTO createUser(UserRequestDTO userDTO) {
        User user = UserMapper.toEntity(userDTO);
        User response =  userRepository.save(user);
        return UserMapper.toResponse(response);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public User updateUser(Integer id, User userDetails) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPhone(userDetails.getPhone());
        user.setMaritalStatus(userDetails.getMaritalStatus());

        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}