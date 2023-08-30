package com.scale_events.web.adapter;

import com.scale_events.model.InternalTrainingEvent;
import com.scale_events.model.InternalTrainingEventDO;
import com.scale_events.web.dto.InternalTrainingEventDTO;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class InternalTrainingEventDTOAdapter implements DTOAdapter<InternalTrainingEventDTO, InternalTrainingEvent>{
    private final LocationDTOAdapter locationDTOAdapter;
    private final TopicDTOAdapter topicDTOAdapter;



    public InternalTrainingEventDTOAdapter(LocationDTOAdapter locationDTOAdapter, TopicDTOAdapter topicDTOAdapter) {
        this.locationDTOAdapter = locationDTOAdapter;
        this.topicDTOAdapter = topicDTOAdapter;
    }

    @Override
    public InternalTrainingEventDTO convertToDTO(InternalTrainingEvent intTE) {
        if(intTE == null){
            return null;
        }
        InternalTrainingEventDTO internalTrainingEventDTO = new InternalTrainingEventDTO();
        internalTrainingEventDTO.setId(intTE.getId());
        internalTrainingEventDTO.setName(intTE.getName());
        internalTrainingEventDTO.setImageUrl(intTE.getImageUrl());
        internalTrainingEventDTO.setStartDate(intTE.getStartDate());
        internalTrainingEventDTO.setEndDate(intTE.getEndDate());
        internalTrainingEventDTO.setDescription(intTE.getDescription());
        internalTrainingEventDTO.setRecordingUrl(intTE.getRecordingUrl());
        internalTrainingEventDTO.setLocation(locationDTOAdapter.convertToDTO(intTE.getLocation()));
        internalTrainingEventDTO.setTopic(topicDTOAdapter.convertToDTO(intTE.getTopic()));

        return internalTrainingEventDTO;

    }
    @Override
    public InternalTrainingEvent convertFromDTO(InternalTrainingEventDTO intTED) {
        if(intTED == null){
            return null;
        }

        InternalTrainingEvent internalTrainingEvent = new InternalTrainingEventDO();
        internalTrainingEvent.setId(intTED.getId());
        internalTrainingEvent.setName(intTED.getName());
        internalTrainingEvent.setImageUrl(intTED.getImageUrl());
        internalTrainingEvent.setStartDate(intTED.getStartDate());
        internalTrainingEvent.setEndDate(intTED.getEndDate());
        internalTrainingEvent.setDescription(intTED.getDescription());
        internalTrainingEvent.setRecordingUrl(intTED.getRecordingUrl());
        internalTrainingEvent.setTopic(topicDTOAdapter.convertFromDTO(intTED.getTopic()));
        internalTrainingEvent.setLocation(locationDTOAdapter.convertFromDTO(intTED.getLocation()));

        return internalTrainingEvent;
    }

    protected Set<InternalTrainingEventDTO> convertToDTOSet(Set<InternalTrainingEvent> internalTrainingEvents) {
        if (internalTrainingEvents == null){
            return null;
        }
        Set<InternalTrainingEventDTO> internalTrainingEventDTOSet = new LinkedHashSet<>();
        for (InternalTrainingEvent internalTrainingEvent : internalTrainingEvents){
            internalTrainingEventDTOSet.add(convertToDTO(internalTrainingEvent));
        }
        return internalTrainingEventDTOSet;
    }

    protected Set<InternalTrainingEvent> convertFromDTOSet(Set<InternalTrainingEventDTO> internalTrainingEventDTOSet) {
        if (internalTrainingEventDTOSet == null){
            return null;
        }
        Set<InternalTrainingEvent> internalTrainingEvents = new LinkedHashSet<>();
        for (InternalTrainingEventDTO internalTrainingEventDTO : internalTrainingEventDTOSet){
            internalTrainingEvents.add(convertFromDTO(internalTrainingEventDTO));
        }
        return internalTrainingEvents;
    }
}
