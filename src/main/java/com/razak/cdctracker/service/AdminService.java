package com.razak.cdctracker.service;

import com.razak.cdctracker.model.Admin;
import com.razak.cdctracker.model.Role;
import com.razak.cdctracker.repository.AdminRepository;
import com.razak.cdctracker.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AdminService {

        Admin createAdmin(Admin admin);

}
