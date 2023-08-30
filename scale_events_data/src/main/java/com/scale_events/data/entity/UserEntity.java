package com.scale_events.data.entity;


import com.scale_events.model.enums.RoleNameEnum;
import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    @ManyToOne
    private LocationEntity location;


    @Enumerated(EnumType.STRING)
    private RoleNameEnum role;


    public UserEntity() {
    }

    public UserEntity(UUID id, String firstName, String lastName, String password, String email, LocationEntity location, RoleNameEnum role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.location = location;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public UserEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public UserEntity setLocation(LocationEntity location) {
        this.location = location;
        return this;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public UserEntity setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
}