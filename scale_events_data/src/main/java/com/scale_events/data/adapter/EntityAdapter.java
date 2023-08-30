package com.scale_events.data.adapter;

public interface EntityAdapter<T, S> {
    T convertToEntity(S s);

    S convertFromEntity(T t);
}
