package com.scaler.splitwise.services;

import com.scaler.splitwise.services.interfaces.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptEncoder implements PasswordEncoder {

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    public String encode(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    public Boolean matches(String password, String hashedPassword) {
        return bCryptPasswordEncoder.matches(password, hashedPassword);
    }
}
