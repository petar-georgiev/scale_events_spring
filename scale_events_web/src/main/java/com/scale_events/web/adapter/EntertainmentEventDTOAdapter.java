package com.scale_events.web.adapter;

import com.scale_events.model.EntertainmentEvent;
import com.scale_events.model.EntertainmentEventDO;
import com.scale_events.web.dto.EntertainmentEventDTO;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class EntertainmentEventDTOAdapter implements DTOAdapter<EntertainmentEventDTO, EntertainmentEvent> {
    private final LocationDTOAdapter locationDTOAdapter;

    public EntertainmentEventDTOAdapter(LocationDTOAdapter locationDTOAdapter) {
        this.locationDTOAdapter = locationDTOAdapter;
    }
    @Override
    public EntertainmentEventDTO convertToDTO(EntertainmentEvent entE) {
        if(entE == null){
            return null;
        }
        EntertainmentEventDTO entertainmentEventDTO = new EntertainmentEventDTO();
        entertainmentEventDTO.setId(entE.getId());
        entertainmentEventDTO.setName(entE.getName());
        entertainmentEventDTO.setImageUrl(entE.getImageUrl());
        entertainmentEventDTO.setStartDate(entE.getStartDate());
        entertainmentEventDTO.setEndDate(entE.getEndDate());
        entertainmentEventDTO.setDescription(entE.getDescription());
        entertainmentEventDTO.setLocation(locationDTOAdapter.convertToDTO(entE.getLocation()));
        entertainmentEventDTO.setActivity(entE.getActivity());

        return entertainmentEventDTO;
    }
    @Override
    public EntertainmentEvent convertFromDTO(EntertainmentEventDTO entertainmentEventDTO) {
        if(entertainmentEventDTO == null){
            return null;
        }

        EntertainmentEvent entertainmentEvent = new EntertainmentEventDO();
        entertainmentEvent.setId(entertainmentEventDTO.getId());
        entertainmentEvent.setName(entertainmentEventDTO.getName());
        entertainmentEvent.setImageUrl(entertainmentEventDTO.getImageUrl());
        entertainmentEvent.setStartDate(entertainmentEventDTO.getStartDate());
        entertainmentEvent.setEndDate(entertainmentEventDTO.getEndDate());
        entertainmentEvent.setDescription(entertainmentEventDTO.getDescription());
        entertainmentEvent.setLocation(locationDTOAdapter.convertFromDTO(entertainmentEventDTO.getLocation()));
        entertainmentEvent.setActivity(entertainmentEventDTO.getActivity());

        return entertainmentEvent;
    }
    protected Set<EntertainmentEventDTO> convertToDTOSet(Set<EntertainmentEvent> entertainmentEvents) {
        if (entertainmentEvents == null){
            return null;
        }
        Set<EntertainmentEventDTO> entertainmentEventDTOSet = new LinkedHashSet<>();
        for (EntertainmentEvent entertainmentEvent : entertainmentEvents){
            entertainmentEventDTOSet.add(convertToDTO(entertainmentEvent));
        }
        return entertainmentEventDTOSet;
    }

    protected Set<EntertainmentEvent> convertFromDTOSet(Set<EntertainmentEventDTO> entertainmentEventDTOSet) {
        if (entertainmentEventDTOSet == null){
            return null;
        }
        Set<EntertainmentEvent> entertainmentEvents = new LinkedHashSet<>();
        for (EntertainmentEventDTO entertainmentEventDTO : entertainmentEventDTOSet){
            entertainmentEvents.add(convertFromDTO(entertainmentEventDTO));
        }
        return entertainmentEvents;
    }

}
