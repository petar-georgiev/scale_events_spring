package com.scale_events.data.adapter;

import com.scale_events.data.entity.SeminarEventEntity;
import com.scale_events.model.SeminarEvent;
import com.scale_events.model.SeminarEventDO;

public class SeminarEventAdapter implements EntityAdapter<SeminarEventEntity, SeminarEvent> {
    private final LocationAdapter locationAdapter;
    private final TopicAdapter topicAdapter;

    public SeminarEventAdapter(LocationAdapter locationAdapter, TopicAdapter topicAdapter) {
        this.locationAdapter = locationAdapter;
        this.topicAdapter = topicAdapter;
    }

    @Override
    public SeminarEventEntity convertToEntity(SeminarEvent semE) {
        if (semE == null) {
            return null;
        }
        SeminarEventEntity seminarEventEntity = new SeminarEventEntity();
        seminarEventEntity.setId(semE.getId());
        seminarEventEntity.setName(semE.getName());
        seminarEventEntity.setImageUrl(semE.getImageUrl());
        seminarEventEntity.setStartDate(semE.getStartDate());
        seminarEventEntity.setEndDate(semE.getEndDate());
        seminarEventEntity.setDescription(semE.getDescription());
        seminarEventEntity.setRecordingUrl(semE.getRecordingUrl());
        seminarEventEntity.setLocations(locationAdapter.convertToEntitySet(semE.getLocations()));
        seminarEventEntity.setTopics(topicAdapter.convertToEntitySet(semE.getTopics()));

        return seminarEventEntity;
    }

    @Override
    public SeminarEvent convertFromEntity(SeminarEventEntity semEE) {
        if (semEE == null) {
            return null;
        }
        SeminarEvent seminarEvent = new SeminarEventDO();
        seminarEvent.setId(semEE.getId());
        seminarEvent.setName(semEE.getName());
        seminarEvent.setImageUrl(semEE.getImageUrl());
        seminarEvent.setStartDate(semEE.getStartDate());
        seminarEvent.setEndDate(semEE.getEndDate());
        seminarEvent.setDescription(semEE.getDescription());
        seminarEvent.setRecordingUrl(semEE.getRecordingUrl());
        seminarEvent.setLocations(locationAdapter.convertFromEntitySet(semEE.getLocations()));
        seminarEvent.setTopics(topicAdapter.convertFromEntitySet(semEE.getTopics()));

        return seminarEvent;
    }
}
