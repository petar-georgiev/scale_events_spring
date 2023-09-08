package com.scale_events.data.repository;

import com.scale_events.data.entity.SeminarEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SeminarEventRepository extends JpaRepository<SeminarEventEntity, UUID> {
}
