package com.razak.cdctracker.mappers;

import com.razak.cdctracker.DTOs.AdminDTO;
import com.razak.cdctracker.model.Admin;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {
    public AdminDTO toAdminDto(Admin admin) {
        AdminDTO adminDto = new AdminDTO();
        adminDto.setId(admin.getId());
        adminDto.setUsername(admin.getUsername());
        adminDto.setEmail(admin.getEmail());
        adminDto.setRoleName((admin.getRole().getName()));

        return adminDto;
    }

    public Admin toAdminEntity(AdminDTO adminDto) {
        Admin admin = new Admin();
        admin.setId(adminDto.getId());
        admin.setUsername(adminDto.getUsername());
        admin.setEmail(adminDto.getEmail());
        // Map other fields as needed
        return admin;
    }
}



