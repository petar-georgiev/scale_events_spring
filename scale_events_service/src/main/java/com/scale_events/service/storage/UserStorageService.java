package com.scale_events.service.storage;

import com.scale_events.model.UserDO;

import java.util.List;

public interface UserStorageService {
    List<UserDO> findAll();
}
