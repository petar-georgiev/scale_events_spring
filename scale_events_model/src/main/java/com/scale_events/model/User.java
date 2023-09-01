package com.scale_events.model;

import com.scale_events.model.enums.RoleNameEnum;

import java.util.UUID;

public interface User {
    UUID getId();

    String getFirstName();

    String getLastName();

    String getPassword();

    String getEmail();

    LocationDO getLocation();

    RoleNameEnum getRole();


    void setId(UUID id);

    void setFirstName(String firstname);

    void setLastName(String lastname);

    void setPassword(String password);

    void setEmail(String email);

    void setLocation(LocationDO location);

    void setRole(RoleNameEnum role);
}
