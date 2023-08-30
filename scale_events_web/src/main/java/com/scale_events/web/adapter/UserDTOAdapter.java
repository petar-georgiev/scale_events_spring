package com.scale_events.web.adapter;

import com.scale_events.model.User;
import com.scale_events.model.UserDO;
import com.scale_events.web.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;
@Component
public class UserDTOAdapter implements DTOAdapter<UserDTO, User> {
    private final LocationDTOAdapter locationDTOAdapter;

    public UserDTOAdapter(LocationDTOAdapter locationDTOAdapter) {
        this.locationDTOAdapter = locationDTOAdapter;
    }

    @Override
    public UserDTO convertToDTO(User user) {
        if (user == null) {
            return null;
        }
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setPassword(user.getPassword());

        if (user.getEmail() != null) {
            userDTO.setEmail(user.getEmail());
        }
        userDTO.setLocation(locationDTOAdapter.convertToDTO(user.getLocation()));
        userDTO.setRole(user.getRole());

        return userDTO;
    }

    @Override
    public User convertFromDTO(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        User user = new UserDO();

        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPassword(userDTO.getPassword());

        if (user.getEmail() != null) {
            user.setEmail(userDTO.getEmail());
        }
        user.setLocation(locationDTOAdapter.convertFromDTO(userDTO.getLocation()));
        user.setRole(userDTO.getRole());

        return user;
    }

    protected Set<UserDTO> convertToDTOSet(Set<User> users) {
        if (users == null) {
            return null;
        }
        Set<UserDTO> userDTOSet = new LinkedHashSet<>();
        for (User user : users) {
            userDTOSet.add(convertToDTO(user));
        }
        return userDTOSet;
    }

    protected Set<User> convertFromDTOSet(Set<UserDTO> userDTOSet) {
        if (userDTOSet == null) {
            return null;
        }
        Set<User> users = new LinkedHashSet<>();
        for (UserDTO userDTO : userDTOSet) {
            users.add(convertFromDTO(userDTO));
        }
        return users;
    }
}
