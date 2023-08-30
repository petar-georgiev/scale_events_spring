package com.scale_events.model;

import com.scale_events.model.enums.OfficeLocationEnum;

import java.util.Set;
import java.util.UUID;

public interface Location {
    UUID getId();

    OfficeLocationEnum getName();

    Set<User> getUsers();

    SeminarEvent getSeminarEvent();

    Set<InternalTrainingEvent> getInternalTrainingEvents();

    Set<EntertainmentEvent> getEntertainmentEvents();

    void setId(UUID id);
    void setName(OfficeLocationEnum officeLocationEnum);
    void setUsers(Set<User> users);
    void setSeminarEvent(SeminarEvent seminarEvent);
    void setInternalTrainingEvents(Set<InternalTrainingEvent> internalTrainingEvents);
    void setEntertainmentEvents(Set<EntertainmentEvent> entertainmentEvents);

}
