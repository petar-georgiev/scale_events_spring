package com.example.scale_events_spring.repository;

import com.example.scale_events_spring.model.entity.SeminarEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeminarEventRepo extends JpaRepository<SeminarEvent, String> {
}
