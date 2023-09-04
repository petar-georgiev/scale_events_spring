package com.scale_events.web.controller;

import com.scale_events.model.UserDO;
import com.scale_events.service.domain.UserService;
import com.scale_events.web.adapter.UserDTOAdapter;
import com.scale_events.web.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class UserRestController {
   private final UserService userService;

   private final UserDTOAdapter userDTOAdapter;

   public UserRestController(UserService userService, UserDTOAdapter userDTOAdapter) {
      this.userService = userService;
      this.userDTOAdapter = userDTOAdapter;
   }


      @GetMapping
      public ResponseEntity<List<UserDTO>> getAllUsers() {
      List<UserDO> fetchedUsers = userService.findAllUsers();
      List<UserDTO> users = new ArrayList<>();

      for(UserDO user : fetchedUsers){
         UserDTO userDTO = userDTOAdapter.convertToDTO(user);
         users.add(userDTO);
      }
         return ResponseEntity.ok(users);
      }
}
