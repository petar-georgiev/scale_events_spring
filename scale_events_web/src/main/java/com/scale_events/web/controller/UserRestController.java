package com.scale_events.web.controller;

import com.scale_events.model.LoginDO;
import com.scale_events.model.UserDO;
import com.scale_events.service.domain.UserService;
import com.scale_events.web.adapter.LoginDTOAdapter;
import com.scale_events.web.adapter.UserDTOAdapter;
import com.scale_events.web.dto.LoginDTO;
import com.scale_events.web.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1")
public class UserRestController {
    private final UserService userService;
    private final UserDTOAdapter userDTOAdapter;
    private final LoginDTOAdapter loginDTOAdapter;

    public UserRestController(UserService userService, UserDTOAdapter userDTOAdapter, LoginDTOAdapter loginDTOAdapter, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.userDTOAdapter = userDTOAdapter;
        this.loginDTOAdapter = loginDTOAdapter;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDO> fetchedUsers = userService.findAllUsers();
        List<UserDTO> users = fetchedUsers.stream()
                .map(userDTOAdapter::convertToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable UUID id) {
        UserDO fetchedUser = userService.findById(id);
        UserDTO users = userDTOAdapter.convertToDTO(fetchedUser);
        return ResponseEntity.ok(users);
    }

    @PostMapping("/register")
    public ResponseEntity<String> saveEmployee(@RequestBody UserDTO userDTO) {
        UserDO userDO = userDTOAdapter.convertFromDTO(userDTO);
        return ResponseEntity.ok(userService.addUser(userDO));
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginDO loginDO = loginDTOAdapter.convertFromDTO(loginDTO);
        return ResponseEntity.ok(userService.loginUser(loginDO));
    }

    @DeleteMapping("/users/delete/{id}")
    ResponseEntity<?> deleteUser(@PathVariable UUID id) {
        userService.deleteItem(id);
        return ResponseEntity.ok("User with ID " + id + " deleted successfully.");
    }
}
