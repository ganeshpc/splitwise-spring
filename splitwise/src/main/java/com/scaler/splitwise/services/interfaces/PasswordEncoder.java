package com.scaler.splitwise.services.interfaces;

public interface PasswordEncoder {
    String encode(String password);

    Boolean matches(String password, String hashedPassword);
}
