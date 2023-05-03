package com.scaler.splitwise.services;

import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.dtos.GetUserDTO;
import com.scaler.splitwise.models.User;
import com.scaler.splitwise.repositories.UserRepository;
import com.scaler.splitwise.services.interfaces.PasswordEncoder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private PasswordEncoder passwordEncoder;
    private UserRepository userRepository;
    public User createUser(CreateUserDTO createUserDTO) {
        User user = createUserDTO.toUser(passwordEncoder.encode(createUserDTO.getPassword()));
        return userRepository.save(user);
    }
}
