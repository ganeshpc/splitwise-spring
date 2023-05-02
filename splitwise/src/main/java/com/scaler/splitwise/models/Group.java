package com.scaler.splitwise.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group extends BaseModel{
    private String name;

    @ManyToMany
    private List<User> admins = new ArrayList<>();

    @ManyToMany
    private List<User> members = new ArrayList<>();

    @ManyToOne
    private User createdBy;
}
