package com.scale_events.web.adapter;

import com.scale_events.model.SeminarEvent;
import com.scale_events.model.SeminarEventDO;
import com.scale_events.web.dto.SeminarEventDTO;
import org.springframework.stereotype.Component;

@Component
public class SeminarEventDTOAdapter implements DTOAdapter<SeminarEventDTO, SeminarEvent> {
    private final LocationDTOAdapter locationDTOAdapter;
    private final TopicDTOAdapter topicDTOAdapter;

    public SeminarEventDTOAdapter(LocationDTOAdapter locationDTOAdapter, TopicDTOAdapter topicDTOAdapterAdapter) {
        this.locationDTOAdapter = locationDTOAdapter;

        this.topicDTOAdapter = topicDTOAdapterAdapter;
    }

    @Override
    public SeminarEventDTO convertToDTO(SeminarEvent semE) {
        if (semE == null) {
            return null;
        }
        SeminarEventDTO seminarEventDTO = new SeminarEventDTO();
        seminarEventDTO.setId(semE.getId());
        seminarEventDTO.setName(semE.getName());
        seminarEventDTO.setImageUrl(semE.getImageUrl());
        seminarEventDTO.setStartDate(semE.getStartDate());
        seminarEventDTO.setEndDate(semE.getEndDate());
        seminarEventDTO.setDescription(semE.getDescription());
        seminarEventDTO.setRecordingURL(semE.getRecordingUrl());
        seminarEventDTO.setLocations(locationDTOAdapter.convertToDTOSet(semE.getLocations()));
        seminarEventDTO.setTopics(topicDTOAdapter.convertToDTOSet(semE.getTopics()));

        return seminarEventDTO;
    }

    @Override
    public SeminarEvent convertFromDTO(SeminarEventDTO semED) {
        if (semED == null) {
            return null;
        }
        SeminarEvent seminarEvent = new SeminarEventDO();
        seminarEvent.setId(semED.getId());
        seminarEvent.setName(semED.getName());
        seminarEvent.setImageUrl(semED.getImageUrl());
        seminarEvent.setStartDate(semED.getStartDate());
        seminarEvent.setEndDate(semED.getEndDate());
        seminarEvent.setDescription(semED.getDescription());
        seminarEvent.setRecordingUrl(semED.getRecordingURL());
        seminarEvent.setLocations(locationDTOAdapter.convertFromDTOSet(semED.getLocations()));
        seminarEvent.setTopics(topicDTOAdapter.convertFromDTOSet(semED.getTopics()));

        return seminarEvent;
    }
}
