package com.scale_events.web.dto;


import com.scale_events.model.enums.RoleNameEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;


public  class UserDTO {
    private  @NotNull UUID id;
    private  String firstName;
    private  String lastName;
    private  String password;
    private  @Email String email;
    private  LocationDTO location;
    private  RoleNameEnum role;

    public UserDTO() {
    }

    public UserDTO(UUID id, String firstName, String lastName, String password, String email, LocationDTO location, RoleNameEnum role) {
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

    public UserDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocationDTO getLocation() {
        return location;
    }

    public UserDTO setLocation(LocationDTO location) {
        this.location = location;
        return this;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public UserDTO setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (UserDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.lastName, that.lastName) &&
                Objects.equals(this.password, that.password) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.location, that.location) &&
                Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, password, email, location, role);
    }

    @Override
    public String toString() {
        return "UserDTO[" +
                "id=" + id + ", " +
                "firstname=" + firstName + ", " +
                "lastname=" + lastName + ", " +
                "password=" + password + ", " +
                "email=" + email + ", " +
                "location=" + location + ", " +
                "role=" + role + ']';
    }

}
