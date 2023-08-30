package com.scale_events.data.repository;

import com.scale_events.data.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LocationRepo extends JpaRepository<LocationEntity, UUID> {
}
