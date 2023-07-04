package com.razak.cdctracker.service.implementation;

import com.razak.cdctracker.model.Admin;
import com.razak.cdctracker.model.Role;
import com.razak.cdctracker.repository.AdminRepository;
import com.razak.cdctracker.repository.RoleRepository;
import com.razak.cdctracker.service.AdminService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    private final RoleRepository roleRepository;

    public Admin createAdmin(String username, String email, String password, String roleName) {
        Optional<Role> roleOptional = roleRepository.findByName(roleName);
        if (roleOptional.isEmpty()) {
            throw new IllegalArgumentException("Role not found: " + roleName);
        }

        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setEmail(email);
        admin.setPassword(password);

        Role role = roleOptional.get();
        admin.setRole(role);

        return adminRepository.save(admin);
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
