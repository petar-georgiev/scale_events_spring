package com.scale_events.data.repository;

import com.scale_events.data.entity.SkillAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillAreaRepository extends JpaRepository<SkillAreaEntity, Long> {
}
