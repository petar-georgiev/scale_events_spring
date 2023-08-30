package com.scale_events.model;

public interface EntertainmentEvent extends Event {
    String getActivity();

    Location getLocation();

    void setActivity(String activity);

    void setLocation(Location location);


}
