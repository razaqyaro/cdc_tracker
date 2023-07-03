package com.razak.cdctracker.DTOs;

import com.razak.cdctracker.model.Advisor;
import com.razak.cdctracker.model.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdviseeDTO
{
    private Long id;
    private String username;
    private String email;
    private LocalDate dateOfBirth;
    private Location location;
    private Advisor advisor;
}
