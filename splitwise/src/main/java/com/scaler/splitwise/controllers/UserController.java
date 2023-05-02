package com.scaler.splitwise.controllers;

import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.dtos.GetUserDTO;
import com.scaler.splitwise.exceptions.InvalidUserRequest;
import com.scaler.splitwise.models.User;
import com.scaler.splitwise.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @PostMapping("user")
    public GetUserDTO createUser(@RequestBody CreateUserDTO createUserDTO) {
        validate(createUserDTO);
        User user = userService.createUser(createUserDTO);
        return GetUserDTO.fromUser(user);
    }

    private void validate(CreateUserDTO createUserDTO) {
        if (createUserDTO.getName().isEmpty() || createUserDTO.getPhoneNumber().isEmpty() || createUserDTO.getPassword().isEmpty()) {
            throw new InvalidUserRequest("One of the fields is blank");
        }
    }
}
