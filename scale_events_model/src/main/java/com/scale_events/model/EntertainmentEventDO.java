package com.scale_events.model;

public class EntertainmentEventDO extends EventDO implements EntertainmentEvent {
    private String activity;
    private LocationDO location;

    @Override
    public String getActivity() {
        return activity;
    }

    @Override
    public LocationDO getLocation() {
        return location;
    }

    @Override
    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public void setLocation(LocationDO location) {
        this.location = location;
    }
}
