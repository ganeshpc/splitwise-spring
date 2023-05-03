package com.scaler.splitwise.dtos;

import com.scaler.splitwise.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CreateUserDTO {
    private String name;
    private String phoneNumber;
    private String password;

    public User toUser(String hashedPassword) {
        User user = new User();
        user.setName(this.getName());
        user.setPhoneNumber(this.getPhoneNumber());
        user.setHashedPassword(hashedPassword);
        return user;
    }
}
