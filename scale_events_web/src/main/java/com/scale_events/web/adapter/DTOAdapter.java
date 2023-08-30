package com.scale_events.web.adapter;

public interface DTOAdapter<T, S> {
    T convertToDTO(S s);

    S convertFromDTO(T t);
}
