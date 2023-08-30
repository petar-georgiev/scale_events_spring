package com.scale_events.model;

import com.scale_events.model.enums.RoleNameEnum;

import java.util.UUID;

public class UserDO implements User {

    private UUID id;
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private Location location;
    private RoleNameEnum role;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public RoleNameEnum getRole() {
        return role;
    }


    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void setRole(RoleNameEnum role) {
        this.role = role;
    }
}
