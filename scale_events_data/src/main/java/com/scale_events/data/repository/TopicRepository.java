package com.scale_events.data.repository;

import com.scale_events.data.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TopicRepository extends JpaRepository<TopicEntity, UUID> {
}
