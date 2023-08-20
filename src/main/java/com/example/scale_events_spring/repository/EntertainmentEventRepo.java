package com.example.scale_events_spring.repository;

import com.example.scale_events_spring.model.entity.EntertainmentEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntertainmentEventRepo extends JpaRepository<EntertainmentEvent, String> {
}
