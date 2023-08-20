package com.example.scale_events_spring.repository;

import com.example.scale_events_spring.model.entity.InternalTrainingEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTrainingEventRepo extends JpaRepository<InternalTrainingEvent, String> {
}
