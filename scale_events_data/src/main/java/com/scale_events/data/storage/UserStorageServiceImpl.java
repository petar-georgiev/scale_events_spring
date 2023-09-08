package com.scale_events.data.storage;

import com.scale_events.data.adapter.UserAdapter;
import com.scale_events.data.entity.UserEntity;
import com.scale_events.data.exception.InvalidPasswordException;
import com.scale_events.data.exception.UserNotFoundException;
import com.scale_events.data.repository.UserRepository;
import com.scale_events.model.LoginDO;
import com.scale_events.model.UserDO;
import com.scale_events.service.response.LoginResponse;
import com.scale_events.service.storage.UserStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserStorageServiceImpl implements UserStorageService {

    private static final Logger logger =
            LoggerFactory.getLogger(UserStorageServiceImpl.class);
    private final UserRepository userRepository;
    private final UserAdapter userAdapter;
    private final PasswordEncoder passwordEncoder;

    public UserStorageServiceImpl(UserRepository userRepository, UserAdapter userAdapter, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userAdapter = userAdapter;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<UserDO> findAllUsers() {
        List<UserEntity> fetchedUsers = userRepository.findAll();

        List<UserDO> users = new ArrayList<>();

        for (UserEntity user : fetchedUsers) {
            users.add(userAdapter.convertFromEntity(user));
        }
        return users;
    }


    @Override
    public String addUser(UserDO userDO) {
        UserEntity user = userAdapter.convertToEntity(userDO);
        UserEntity savedUser = userRepository.save(user);
        logger.info("User created {}", savedUser.getId());
        return user.getFirstName();
    }

    @Override
    public LoginResponse loginUser(LoginDO loginDO) {
        try {
            UserEntity fetchedUser = userRepository.findByEmail(loginDO.getEmail());
            if (fetchedUser == null) {
                throw new UserNotFoundException("Email not found");
            }

            String password = loginDO.getPassword();
            String encodedPassword = fetchedUser.getPassword();
            boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);

            if (isPwdRight) {
                return new LoginResponse("Login Success", true);
            } else {
                throw new InvalidPasswordException("Login Failed, Passwords Not Match");
            }
        } catch (UserNotFoundException | InvalidPasswordException e) {
            return new LoginResponse(e.getMessage(), false);
        }
    }
}
