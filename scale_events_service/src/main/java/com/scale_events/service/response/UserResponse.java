package com.scale_events.service.response;

import com.scale_events.model.LocationDO;
import com.scale_events.model.enums.RoleNameEnum;

import java.util.Objects;
import java.util.UUID;

public class UserResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private LocationDO location;
    private RoleNameEnum role;

    public UserResponse() {
    }
    public UUID getId() {
        return id;
    }

    public UserResponse setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserResponse setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserResponse setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocationDO getLocation() {
        return location;
    }

    public UserResponse setLocation(LocationDO location) {
        this.location = location;
        return this;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public UserResponse setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse that = (UserResponse) o;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getFirstName(), that.getFirstName())
                && Objects.equals(getLastName(), that.getLastName())
                && Objects.equals(getEmail(), that.getEmail())
                && Objects.equals(getLocation(), that.getLocation())
                && getRole() == that.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getEmail(), getLocation(), getRole());
    }
}
