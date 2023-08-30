package com.scale_events.data.adapter;

import com.scale_events.data.entity.LocationEntity;
import com.scale_events.model.Location;
import com.scale_events.model.LocationDO;

import java.util.LinkedHashSet;
import java.util.Set;

public class LocationAdapter implements EntityAdapter<LocationEntity, Location> {

    private final UserAdapter userAdapter;
    private final SeminarEventAdapter seminarEventAdapter;
    private final InternalTrainingEventAdapter internalTrainingEventAdapter;
    private final EntertainmentEventAdapter entertainmentEventAdapter;

    public LocationAdapter(UserAdapter userAdapter, SeminarEventAdapter seminarEventAdapter, InternalTrainingEventAdapter internalTrainingEventAdapter, EntertainmentEventAdapter entertainmentEventAdapter) {
        this.userAdapter = userAdapter;
        this.seminarEventAdapter = seminarEventAdapter;
        this.internalTrainingEventAdapter = internalTrainingEventAdapter;
        this.entertainmentEventAdapter = entertainmentEventAdapter;
    }

    @Override
    public LocationEntity convertToEntity(Location location) {
        if (location == null) {
            return null;
        }
        LocationEntity locationEntity = new LocationEntity();
        locationEntity.setId(location.getId());
        locationEntity.setName(location.getName());
        locationEntity.setUsers(userAdapter
                .convertToEntitySet(location.getUsers()));
        locationEntity.setSeminarEvent(seminarEventAdapter
                .convertToEntity(location.getSeminarEvent()));
        locationEntity.setInternalTrainingEvents(internalTrainingEventAdapter
                .convertToEntitySet(location.getInternalTrainingEvents()));
        locationEntity.setEntertainmentEvents(entertainmentEventAdapter
                .convertToEntitySet(location.getEntertainmentEvents()));

        return locationEntity;
    }

    @Override
    public Location convertFromEntity(LocationEntity locationEntity) {
        if (locationEntity == null) {
            return null;
        }
        Location location = new LocationDO();
        location.setId(locationEntity.getId());
        location.setName(locationEntity.getName());
        location.setUsers(userAdapter
                .convertFromEntitySet(locationEntity.getUsers()));
        location.setSeminarEvent(seminarEventAdapter
                .convertFromEntity(locationEntity.getSeminarEvent()));
        location.setInternalTrainingEvents(internalTrainingEventAdapter
                .convertFromEntitySet(locationEntity.getInternalTrainingEvents()));
        location.setEntertainmentEvents(entertainmentEventAdapter
                .convertFromEntitySet(locationEntity.getEntertainmentEvents()));

        return location;
    }

    protected Set<LocationEntity> convertToEntitySet(Set<Location> locations) {
        if (locations == null) {
            return null;
        }
        Set<LocationEntity> locationEntities = new LinkedHashSet<>();

        for (Location location : locations) {
            locationEntities.add(convertToEntity(location));
        }

        return locationEntities;
    }

    protected Set<Location> convertFromEntitySet(Set<LocationEntity> locationEntities) {
        if (locationEntities == null) {
            return null;
        }
        Set<Location> location = new LinkedHashSet<>();

        for (LocationEntity locationEntity : locationEntities) {
            location.add(convertFromEntity(locationEntity));
        }

        return location;
    }
}
