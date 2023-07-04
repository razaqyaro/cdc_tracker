package com.razak.cdctracker.mappers;

import com.razak.cdctracker.DTOs.RoleDTO;
import com.razak.cdctracker.model.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    public RoleDTO toRoleDto(Role role) {
        RoleDTO roleDto = new RoleDTO();
        roleDto.setId(role.getId());
        roleDto.setName(role.getName());
        roleDto.setDescription(role.getDescription());

        return roleDto;
    }

    public Role toRoleEntity(RoleDTO requestDto) {
        Role role = new Role();
        role.setName(requestDto.getName());
        role.setDescription(requestDto.getDescription());

        return role;
    }
}

