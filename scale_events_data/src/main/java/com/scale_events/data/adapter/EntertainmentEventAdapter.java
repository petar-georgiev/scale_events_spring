package com.scale_events.data.adapter;

import com.scale_events.data.entity.EntertainmentEventEntity;
import com.scale_events.model.EntertainmentEvent;
import com.scale_events.model.EntertainmentEventDO;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntertainmentEventAdapter implements EntityAdapter<EntertainmentEventEntity, EntertainmentEvent> {

    private final LocationAdapter locationAdapter;

    public EntertainmentEventAdapter(LocationAdapter locationAdapter) {
        this.locationAdapter = locationAdapter;
    }

    @Override
    public EntertainmentEventEntity convertToEntity(EntertainmentEvent entE) {
        if(entE == null){
            return null;
        }
        EntertainmentEventEntity entertainmentEventEntity = new EntertainmentEventEntity();
        entertainmentEventEntity.setId(entE.getId());
        entertainmentEventEntity.setName(entE.getName());
        entertainmentEventEntity.setImageUrl(entE.getImageUrl());
        entertainmentEventEntity.setStartDate(entE.getStartDate());
        entertainmentEventEntity.setEndDate(entE.getEndDate());
        entertainmentEventEntity.setDescription(entE.getDescription());
        entertainmentEventEntity.setLocation(locationAdapter.convertToEntity(entE.getLocation()));
        entertainmentEventEntity.setActivity(entE.getActivity());

        return entertainmentEventEntity;
    }

    @Override
    public EntertainmentEvent convertFromEntity(EntertainmentEventEntity entEE) {
        if(entEE == null){
            return null;
        }

        EntertainmentEvent entertainmentEvent = new EntertainmentEventDO();
        entertainmentEvent.setId(entEE.getId());
        entertainmentEvent.setName(entEE.getName());
        entertainmentEvent.setImageUrl(entEE.getImageUrl());
        entertainmentEvent.setStartDate(entEE.getStartDate());
        entertainmentEvent.setEndDate(entEE.getEndDate());
        entertainmentEvent.setDescription(entEE.getDescription());
        entertainmentEvent.setLocation(locationAdapter.convertFromEntity(entEE.getLocation()));
        entertainmentEvent.setActivity(entEE.getActivity());

        return entertainmentEvent;
    }
    protected Set<EntertainmentEventEntity> convertToEntitySet(Set<EntertainmentEvent> entertainmentEvents) {
        if (entertainmentEvents == null){
            return null;
        }
        Set<EntertainmentEventEntity> entertainmentEventEntities = new LinkedHashSet<>();
        for (EntertainmentEvent entertainmentEvent : entertainmentEvents){
            entertainmentEventEntities.add(convertToEntity(entertainmentEvent));
        }
        return entertainmentEventEntities;
    }

    protected Set<EntertainmentEvent> convertFromEntitySet(Set<EntertainmentEventEntity> entertainmentEventEntities) {
        if (entertainmentEventEntities == null){
            return null;
        }
        Set<EntertainmentEvent> entertainmentEvents = new LinkedHashSet<>();
        for (EntertainmentEventEntity entertainmentEventEntity : entertainmentEventEntities){
            entertainmentEvents.add(convertFromEntity(entertainmentEventEntity));
        }
        return entertainmentEvents;
    }
}
