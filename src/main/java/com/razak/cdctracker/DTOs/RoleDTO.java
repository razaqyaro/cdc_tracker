package com.razak.cdctracker.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO
{
    private Long id;
    private String name;
    private String description;
}
