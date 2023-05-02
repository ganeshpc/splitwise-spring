package com.scaler.splitwise.services;

import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.dtos.GetUserDTO;
import com.scaler.splitwise.models.User;
import com.scaler.splitwise.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    public User createUser(CreateUserDTO createUserDTO) {
        User user = createUserDTO.toUser();

        return userRepository.save(user);
    }
}
