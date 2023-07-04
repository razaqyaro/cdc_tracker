package com.razak.cdctracker.mappers;

import com.razak.cdctracker.DTOs.PermissionDTO;
import com.razak.cdctracker.model.Permission;
import org.springframework.stereotype.Component;

@Component
public class PermissionMapper {

    public PermissionDTO toPermissionDto(Permission permission) {
        PermissionDTO permissionDto = new PermissionDTO();
        permissionDto.setId(permission.getId());
        permissionDto.setName(permission.getName());
        permissionDto.setDescription(permission.getDescription());


        return permissionDto;
    }

    public Permission toPermissionEntity(PermissionDTO permissionDto) {
        Permission permission = new Permission();
        permission.setId(permissionDto.getId());
        permission.setName(permissionDto.getName());
        permission.setDescription(permissionDto.getDescription());


        return permission;
    }
}

