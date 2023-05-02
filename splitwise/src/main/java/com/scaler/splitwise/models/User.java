package com.scaler.splitwise.models;

import com.scaler.splitwise.dtos.GetUserDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Setter
@Getter
public class User extends BaseModel {
    private String name;
    private String phoneNumber;
    private String hashedPassword;
}
