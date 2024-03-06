package org.example.service;

import org.example.dto.ResponseDto;
import org.example.entity.User;

public interface UserService {
    User saveUser(User user);
   ResponseDto getUser(Long id);


}
