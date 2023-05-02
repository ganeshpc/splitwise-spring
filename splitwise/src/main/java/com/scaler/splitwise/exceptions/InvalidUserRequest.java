package com.scaler.splitwise.exceptions;

public class InvalidUserRequest extends RuntimeException{
    public InvalidUserRequest(String message) {
        super(message);
    }
}
