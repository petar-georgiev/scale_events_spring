package com.scale_events.service.storage;

import com.scale_events.model.LoginDO;
import com.scale_events.model.UserDO;

import java.util.List;
import java.util.UUID;

public interface UserStorageService {
    List<UserDO> findAll();

    UserDO findById(UUID id);

    UserDO login(LoginDO loginDO);

    UserDO create(UserDO userDO);

    UserDO update(UserDO userDO, UUID id);

    void delete(UUID id);
}
