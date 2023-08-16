package com.example.scale_events_spring.model.entity;


import com.example.scale_events_spring.model.entity.enums.OfficeLocationEnum;
import com.example.scale_events_spring.model.entity.enums.RoleNameEnum;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String username;
    private String password;
    private String email;
    private String name;

    @ManyToMany
    @JoinTable(name = "user_event",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private Set<Event> events;

    @Enumerated(EnumType.STRING)
    private OfficeLocationEnum location;

    @Enumerated(EnumType.STRING)
    private RoleNameEnum role;


    public User(String id, String username, String password, String email, String name, Set<Event> events, OfficeLocationEnum location, RoleNameEnum role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.events = events;
        this.location = location;
        this.role = role;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public User setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
    public OfficeLocationEnum getLocation() {
        return location;
    }

    public User setLocation(OfficeLocationEnum location) {
        this.location = location;
        return this;
    }
    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public User setEvents(Set<Event> events) {
        this.events = events;
        return this;
    }
}