package com.razak.cdctracker.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO
{
    private Long id;
    private String username;
    private String email;
    private String password;
    private String roleName;
}
