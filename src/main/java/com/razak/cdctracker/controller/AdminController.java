package com.razak.cdctracker.controller;


import com.razak.cdctracker.DTOs.AdminDTO;
import com.razak.cdctracker.mappers.AdminMapper;
import com.razak.cdctracker.model.Admin;
import com.razak.cdctracker.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminController
{
    private final AdminService adminService;
    private final AdminMapper adminMapper;

    public AdminController(AdminService adminService, AdminMapper adminMapper) {
        this.adminService = adminService;
        this.adminMapper = adminMapper;
    }

    @PostMapping
    public ResponseEntity<AdminDTO> createAdmin(@RequestBody AdminDTO adminRequestDto) {
        Admin admin = adminService.createAdmin(adminMapper.toAdminEntity(adminRequestDto));
        AdminDTO adminDto = adminMapper.toAdminDto(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body(adminDto);
    }
}





