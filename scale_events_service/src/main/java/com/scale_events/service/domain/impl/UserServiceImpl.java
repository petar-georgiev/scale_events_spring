package com.scale_events.service.domain.impl;

import com.scale_events.model.LoginDO;
import com.scale_events.model.UserDO;
import com.scale_events.service.domain.UserService;
import com.scale_events.service.storage.UserStorageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final UserStorageService userStorageService;

    public UserServiceImpl(UserStorageService userStorageService) {
        this.userStorageService = userStorageService;
    }

    @Override
    public List<UserDO> findAll() {
        return userStorageService.findAll();
    }

    @Override
    public UserDO findById(UUID id) {
        return userStorageService.findById(id);
    }

    @Override
    public UserDO login(LoginDO loginDO) {
        return userStorageService.login(loginDO);
    }

    @Override
    public UserDO create(UserDO userDO) {
        return userStorageService.create(userDO);
    }

    @Override
    public void delete(UUID id) {
        userStorageService.delete(id);
    }
}