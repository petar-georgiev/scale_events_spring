package com.scale_events.data.adapter;

import com.scale_events.data.entity.UserEntity;
import com.scale_events.model.User;
import com.scale_events.model.UserDO;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserAdapter implements EntityAdapter<UserEntity, User> {

    private final LocationAdapter locationAdapter;

    public UserAdapter(LocationAdapter locationAdapter) {
        this.locationAdapter = locationAdapter;
    }

    @Override
    public UserEntity convertToEntity(User user) {
        if (user == null) {
            return null;
        }
        UserEntity userEntity = new UserEntity();

        userEntity.setId(user.getId());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setPassword(user.getPassword());

        if (user.getEmail() != null) {
            userEntity.setEmail(user.getEmail());
        }
        userEntity.setLocation(locationAdapter.convertToEntity(user.getLocation()));
        userEntity.setRole(user.getRole());

        return userEntity;
    }


    @Override
    public User convertFromEntity(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }
        User user = new UserDO();

        user.setId(userEntity.getId());
        user.setFirstName(userEntity.getFirstName());
        user.setLastName(userEntity.getLastName());
        user.setPassword(userEntity.getPassword());

        if (user.getEmail() != null) {
            user.setEmail(userEntity.getEmail());
        }
        user.setLocation(locationAdapter.convertFromEntity(userEntity.getLocation()));
        user.setRole(userEntity.getRole());

        return user;
    }

    protected Set<UserEntity> convertToEntitySet(Set<User> users) {
        if (users == null) {
            return null;
        }
        Set<UserEntity> userEntities = new LinkedHashSet<>();
        for (User user : users) {
            userEntities.add(convertToEntity(user));
        }
        return userEntities;
    }

    protected Set<User> convertFromEntitySet(Set<UserEntity> userEntities) {
        if (userEntities == null) {
            return null;
        }
        Set<User> users = new LinkedHashSet<>();
        for (UserEntity userEntity : userEntities) {
            users.add(convertFromEntity(userEntity));
        }
        return users;
    }
}
