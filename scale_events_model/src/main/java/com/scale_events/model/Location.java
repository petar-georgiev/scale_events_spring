package com.scale_events.model;

import com.scale_events.model.enums.OfficeLocationEnum;

import java.util.Set;
import java.util.UUID;

public interface Location {
    UUID getId();

    OfficeLocationEnum getName();

    Set<UserDO> getUsers();

    SeminarEventDO getSeminarEvent();

    Set<InternalTrainingEventDO> getInternalTrainingEvents();

    Set<EntertainmentEventDO> getEntertainmentEvents();

    void setId(UUID id);

    void setName(OfficeLocationEnum officeLocationEnum);

    void setUsers(Set<UserDO> users);

    void setSeminarEvent(SeminarEventDO seminarEvent);

    void setInternalTrainingEvents(Set<InternalTrainingEventDO> internalTrainingEvents);

    void setEntertainmentEvents(Set<EntertainmentEventDO> entertainmentEvents);

}
