package com.scale_events.model;

public class EntertainmentEventDO extends EventDO implements EntertainmentEvent {
    private String activity;

    private Location location;


    @Override
    public String getActivity() {
        return activity;
    }

    @Override
    public Location getLocation() {
        return location;
    }


    @Override
    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
}
