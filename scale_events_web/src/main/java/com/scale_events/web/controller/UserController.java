package com.scale_events.web.controller;

import com.scale_events.model.LoginDO;
import com.scale_events.model.UserDO;
import com.scale_events.service.domain.UserService;
import com.scale_events.service.response.UserResponse;
import com.scale_events.web.adapter.LoginDTOAdapter;
import com.scale_events.web.adapter.UserDTOAdapter;
import com.scale_events.web.dto.LoginDTO;
import com.scale_events.web.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1")
public class UserController {
    private final UserService userService;
    private final UserDTOAdapter userDTOAdapter;
    private final LoginDTOAdapter loginDTOAdapter;

    public UserController(UserService userService, UserDTOAdapter userDTOAdapter, LoginDTOAdapter loginDTOAdapter) {
        this.userService = userService;
        this.userDTOAdapter = userDTOAdapter;
        this.loginDTOAdapter = loginDTOAdapter;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getAll() {
        List<UserDO> fetchedUsers = userService.findAll();
        List<UserResponse> users = fetchedUsers.stream()
                .map(userDTOAdapter::convertToResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponse> getById(@PathVariable UUID id) {
        UserDO fetchedUser = userService.findById(id);
        return ResponseEntity.ok(userDTOAdapter.convertToResponse(fetchedUser));
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> login(@RequestBody LoginDTO loginDTO) {
        LoginDO loginDO = loginDTOAdapter.convertFromDTO(loginDTO);
        UserResponse userResponse = userDTOAdapter.convertToResponse(userService.login(loginDO));
        return ResponseEntity.ok(userResponse);
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> create(@RequestBody UserDTO userDTO) {
        UserDO userDO = userDTOAdapter.convertFromDTO(userDTO);
        UserResponse userResponse = userDTOAdapter.convertToResponse(userService.create(userDO));
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<UserResponse> update(@RequestBody UserDTO userDTO, @PathVariable UUID id) {
        UserDO userDO = userDTOAdapter.convertFromDTO(userDTO);
        UserResponse userResponse = userDTOAdapter.convertToResponse(userService.update(userDO, id));
        return ResponseEntity.ok(userResponse);
    }

    @DeleteMapping("/users/{id}")
    ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
