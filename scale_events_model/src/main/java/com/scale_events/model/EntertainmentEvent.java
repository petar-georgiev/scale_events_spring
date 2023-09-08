package com.scale_events.model;

public interface EntertainmentEvent extends Event {
    String getActivity();

    LocationDO getLocation();

    void setActivity(String activity);

    void setLocation(LocationDO location);
}
