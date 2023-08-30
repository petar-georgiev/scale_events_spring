package com.scale_events.data.adapter;

import com.scale_events.data.entity.InternalTrainingEventEntity;
import com.scale_events.model.InternalTrainingEvent;
import com.scale_events.model.InternalTrainingEventDO;

import java.util.LinkedHashSet;
import java.util.Set;


public class InternalTrainingEventAdapter implements EntityAdapter<InternalTrainingEventEntity, InternalTrainingEvent> {
    private final LocationAdapter locationAdapter;
    private final TopicAdapter topicAdapter;

    public InternalTrainingEventAdapter(LocationAdapter locationAdapter, TopicAdapter topicAdapter) {
        this.locationAdapter = locationAdapter;
        this.topicAdapter = topicAdapter;
    }

    @Override
    public InternalTrainingEventEntity convertToEntity(InternalTrainingEvent intTE) {
        if (intTE == null) {
            return null;
        }
        InternalTrainingEventEntity internalTrainingEventEntity = new InternalTrainingEventEntity();
        internalTrainingEventEntity.setId(intTE.getId());
        internalTrainingEventEntity.setName(intTE.getName());
        internalTrainingEventEntity.setImageUrl(intTE.getImageUrl());
        internalTrainingEventEntity.setStartDate(intTE.getStartDate());
        internalTrainingEventEntity.setEndDate(intTE.getEndDate());
        internalTrainingEventEntity.setDescription(intTE.getDescription());
        internalTrainingEventEntity.setRecordingUrl(intTE.getRecordingUrl());
        internalTrainingEventEntity.setLocation(locationAdapter.convertToEntity(intTE.getLocation()));
        internalTrainingEventEntity.setTopic(topicAdapter.convertToEntity(intTE.getTopic()));

        return internalTrainingEventEntity;
    }

    @Override
    public InternalTrainingEvent convertFromEntity(InternalTrainingEventEntity intTEE) {
        if (intTEE == null) {
            return null;
        }
        InternalTrainingEvent internalTrainingEvent = new InternalTrainingEventDO();
        internalTrainingEvent.setId(intTEE.getId());
        internalTrainingEvent.setName(intTEE.getName());
        internalTrainingEvent.setImageUrl(intTEE.getImageUrl());
        internalTrainingEvent.setStartDate(intTEE.getStartDate());
        internalTrainingEvent.setEndDate(intTEE.getEndDate());
        internalTrainingEvent.setDescription(intTEE.getDescription());
        internalTrainingEvent.setRecordingUrl(intTEE.getRecordingUrl());
        internalTrainingEvent.setLocation(locationAdapter.convertFromEntity(intTEE.getLocation()));
        internalTrainingEvent.setTopic(topicAdapter.convertFromEntity(intTEE.getTopic()));

        return internalTrainingEvent;
    }

    protected Set<InternalTrainingEventEntity> convertToEntitySet(Set<InternalTrainingEvent> internalTrainingEvents) {
        if (internalTrainingEvents == null){
            return null;
        }
        Set<InternalTrainingEventEntity> internalTrainingEventEntities = new LinkedHashSet<>();
        for (InternalTrainingEvent internalTrainingEvent : internalTrainingEvents){
            internalTrainingEventEntities.add(convertToEntity(internalTrainingEvent));
        }
        return internalTrainingEventEntities;
    }

    protected Set<InternalTrainingEvent> convertFromEntitySet(Set<InternalTrainingEventEntity> internalTrainingEventEntities) {
        if (internalTrainingEventEntities == null){
            return null;
        }
        Set<InternalTrainingEvent> internalTrainingEvents = new LinkedHashSet<>();
        for (InternalTrainingEventEntity internalTrainingEventEntity : internalTrainingEventEntities){
            internalTrainingEvents.add(convertFromEntity(internalTrainingEventEntity));
        }
        return internalTrainingEvents;
    }

}
