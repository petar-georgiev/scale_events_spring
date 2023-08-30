package com.scale_events.web.adapter;

import com.scale_events.model.Location;
import com.scale_events.model.LocationDO;
import com.scale_events.web.dto.LocationDTO;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class LocationDTOAdapter implements DTOAdapter<LocationDTO, Location> {

    private final UserDTOAdapter userDTOAdapter;
    private final SeminarEventDTOAdapter seminarEventDTOAdapter;
    private final InternalTrainingEventDTOAdapter internalTrainingEventDTOAdapter;
    private final EntertainmentEventDTOAdapter entertainmentEventDTOAdapter;

    public LocationDTOAdapter(UserDTOAdapter userDTOAdapter, SeminarEventDTOAdapter seminarEventDTOAdapter, InternalTrainingEventDTOAdapter internalTrainingEventDTOAdapter, EntertainmentEventDTOAdapter entertainmentEventDTOAdapter) {
        this.userDTOAdapter = userDTOAdapter;
        this.seminarEventDTOAdapter = seminarEventDTOAdapter;
        this.internalTrainingEventDTOAdapter = internalTrainingEventDTOAdapter;
        this.entertainmentEventDTOAdapter = entertainmentEventDTOAdapter;
    }

    @Override
    public LocationDTO convertToDTO(Location location) {
        if (location == null) {
            return null;
        }
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setId(location.getId());
        locationDTO.setName(location.getName());
        locationDTO.setUsers(userDTOAdapter
                .convertToDTOSet(location.getUsers()));
        locationDTO.setSeminarEvent(seminarEventDTOAdapter
                .convertToDTO(location.getSeminarEvent()));
        locationDTO.setInternalTrainingEvents(internalTrainingEventDTOAdapter
                .convertToDTOSet(location.getInternalTrainingEvents()));
        locationDTO.setEntertainmentEvents(entertainmentEventDTOAdapter
                .convertToDTOSet(location.getEntertainmentEvents()));

        return locationDTO;
    }

    @Override
    public Location convertFromDTO(LocationDTO locationDTO) {
        if (locationDTO == null) {
            return null;
        }
        Location location = new LocationDO();
        location.setId(locationDTO.getId());
        location.setName(locationDTO.getName());
        location.setUsers(userDTOAdapter
                .convertFromDTOSet(locationDTO.getUsers()));
        location.setSeminarEvent(seminarEventDTOAdapter
                .convertFromDTO(locationDTO.getSeminarEvent()));
        location.setInternalTrainingEvents(internalTrainingEventDTOAdapter
                .convertFromDTOSet(locationDTO.getInternalTrainingEvents()));
        location.setEntertainmentEvents(entertainmentEventDTOAdapter
                .convertFromDTOSet(locationDTO.getEntertainmentEvents()));

        return location;
    }
    protected Set<LocationDTO> convertToDTOSet(Set<Location> locations) {
        if (locations == null) {
            return null;
        }
        Set<LocationDTO> locationDTOSet = new LinkedHashSet<>();

        for (Location location : locations) {
            locationDTOSet.add(convertToDTO(location));
        }

        return locationDTOSet;
    }

    protected Set<Location> convertFromDTOSet(Set<LocationDTO> locationDTOSet) {
        if (locationDTOSet == null) {
            return null;
        }
        Set<Location> location = new LinkedHashSet<>();

        for (LocationDTO locationDTO : locationDTOSet) {
            location.add(convertFromDTO(locationDTO));
        }

        return location;
    }
}
