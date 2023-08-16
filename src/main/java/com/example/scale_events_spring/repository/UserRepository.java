package com.example.scale_events_spring.repository;

import com.example.scale_events_spring.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String > {
}
