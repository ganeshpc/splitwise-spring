package com.scaler.lld.tictactoegc.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class User {
    private String name;
    private String email;
    private Byte[] profileImage;

    public User(String name, String email, Byte[] profileImage) {
        this.name = name;
        this.email = email;
        this.profileImage = profileImage;
    }
}
