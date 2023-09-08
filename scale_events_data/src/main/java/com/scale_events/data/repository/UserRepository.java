package com.scale_events.data.repository;

import com.scale_events.data.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
   List<UserEntity> findAll();
   UserEntity findByEmail(String email);
}
