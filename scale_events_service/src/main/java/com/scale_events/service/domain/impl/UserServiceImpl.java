package com.scale_events.service.domain.impl;

import com.scale_events.model.UserDO;
import com.scale_events.service.domain.UserService;
import com.scale_events.service.storage.UserStorageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserStorageService userStorageService;

    public UserServiceImpl(UserStorageService userStorageService) {
        this.userStorageService = userStorageService;
    }

    @Override
    public List<UserDO> findAllUsers() {
        return  userStorageService.findAll();
    }
}