package com.scale_events.data.storage;

import com.scale_events.data.adapter.LocationAdapter;
import com.scale_events.data.adapter.UserAdapter;
import com.scale_events.data.entity.UserEntity;
import com.scale_events.data.exception.DuplicateEmailException;
import com.scale_events.data.exception.InvalidPasswordException;
import com.scale_events.data.repository.UserRepository;
import com.scale_events.model.LoginDO;
import com.scale_events.model.UserDO;
import com.scale_events.service.storage.UserStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserStorageServiceImpl implements UserStorageService {

    private static final Logger logger =
            LoggerFactory.getLogger(UserStorageServiceImpl.class);
    private final UserRepository userRepository;
    private final UserAdapter userAdapter;
    private final PasswordEncoder passwordEncoder;

    private final LocationAdapter locationAdapter;


    public UserStorageServiceImpl(UserRepository userRepository, UserAdapter userAdapter, LocationAdapter locationAdapter, PasswordEncoder passwordEncoder, LocationAdapter locationAdapter1) {
        this.userRepository = userRepository;
        this.userAdapter = userAdapter;
        this.passwordEncoder = passwordEncoder;
        this.locationAdapter = locationAdapter1;
    }

    @Override
    public List<UserDO> findAll() {
        List<UserEntity> fetchedUsers = userRepository.findAll();
        return fetchedUsers.stream()
                .map(userAdapter::convertFromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public UserDO findById(UUID id) {
        return userRepository.findById(id)
                .map(userAdapter::convertFromEntity)
                .orElseThrow(()-> new RuntimeException("User not found."));
    }

    @Override
    public UserDO login(LoginDO loginDO) {
        UserEntity fetchedUser = userRepository.findByEmail(loginDO.getEmail());

        if (fetchedUser == null) {
            throw new UsernameNotFoundException("User not found.");
        }

        String password = loginDO.getPassword();
        String encodedPassword = fetchedUser.getPassword();
        boolean isCorrectPassword = passwordEncoder.matches(password, encodedPassword);

        if (!isCorrectPassword) {
            logger.info("User {} with failed login.", fetchedUser.getId());
            throw new InvalidPasswordException("Login failed, passwords do not match.");
        }
        logger.info("User {} with successful login.", fetchedUser.getId());
        return userAdapter.convertFromEntity(fetchedUser);
    }

    @Override
    public UserDO create(UserDO userDO) {
        UserEntity fetchedUser = userRepository.findByEmail(userDO.getEmail());

        if (fetchedUser != null) {
            logger.error("Duplicate email found: {}.", userDO.getEmail());
            throw new DuplicateEmailException("Email already exists.");
        }

        UserEntity user = userAdapter.convertToEntity(userDO);
        user.setPassword(passwordEncoder.encode(userDO.getPassword()));

        UserEntity savedUser = userRepository.save(user);
        logger.info("User created with id: {}.", savedUser.getId());
        return userAdapter.convertFromEntity(savedUser);
    }

    @Override
    public UserDO update(UserDO userDO, UUID id) {
        UserEntity fetchedUser = userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found."));

        UserEntity user = userAdapter.convertToEntity(userDO);
        userRepository.save(user);

        logger.info("User updated with id: {}.", fetchedUser.getId());

        return userAdapter.convertFromEntity(fetchedUser);
    }

    @Override
    public void delete(UUID id) {
        UserEntity fetchedUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found."));

        userRepository.delete(fetchedUser);
        logger.info("Deleted user with id: {}", id);
    }
}
