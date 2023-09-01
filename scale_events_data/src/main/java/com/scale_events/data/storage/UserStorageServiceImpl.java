package com.scale_events.data.storage;

import com.scale_events.data.adapter.UserAdapter;
import com.scale_events.data.entity.UserEntity;
import com.scale_events.data.repository.UserRepository;
import com.scale_events.model.UserDO;
import com.scale_events.service.storage.UserStorageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserStorageServiceImpl implements UserStorageService {

    private final UserRepository userRepository;
    private final UserAdapter userAdapter;

    public UserStorageServiceImpl(UserRepository userRepository, UserAdapter userAdapter) {
        this.userRepository = userRepository;
        this.userAdapter = userAdapter;
    }

    @Override
    public List<UserDO> findAll() {
        List<UserEntity> fetchedUsers = userRepository.findAll();

        List<UserDO> users = new ArrayList<>();

        for (UserEntity user : fetchedUsers) {
            users.add(userAdapter.convertFromEntity(user));
        }

        return users;
    }
}
