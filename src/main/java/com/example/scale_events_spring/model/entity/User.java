package com.example.scale_events_spring.model.entity;


import com.example.scale_events_spring.model.entity.enums.RoleNameEnum;
import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String firstname;
    private String lastname;
    private String password;
    private String email;

    @ManyToOne
    private Location location;


    @Enumerated(EnumType.STRING)
    private RoleNameEnum role;



    public User() {
    }

    public User(String id, String firstname, String lastname, String password, String email, Location location, RoleNameEnum role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.location = location;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public User setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public User setLocation(Location location) {
        this.location = location;
        return this;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public User setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
}