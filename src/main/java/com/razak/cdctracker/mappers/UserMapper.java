package com.razak.cdctracker.mappers;

import com.razak.cdctracker.DTOs.UserDTO;
import com.razak.cdctracker.DTOs.AdminDTO;
import com.razak.cdctracker.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO toUserDto(User user) {
        UserDTO userDto = new UserDTO();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setRoleName(user.getRole().getName());
        return userDto;
    }

    public User toUserEntity(AdminDTO registrationDto) {
        User user = new User();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        // Map other fields as needed
        return user;
    }
}
