package com.scale_events.service.storage;

import com.scale_events.model.LoginDO;
import com.scale_events.model.UserDO;
import com.scale_events.service.response.LoginResponse;

import java.util.List;

public interface UserStorageService {
    List<UserDO> findAllUsers();
    String addUser(UserDO userDO);
    LoginResponse loginUser(LoginDO loginDO);
}
