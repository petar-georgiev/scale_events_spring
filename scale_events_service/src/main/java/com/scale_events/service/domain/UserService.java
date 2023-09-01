package com.scale_events.service.domain;


import com.scale_events.model.UserDO;

import java.util.List;

public interface UserService {
     List<UserDO> findAllUsers();
}