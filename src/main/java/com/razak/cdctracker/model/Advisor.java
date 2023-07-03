package com.razak.cdctracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "advisors")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Advisor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Username;

    private String Email;

    private String Password;

    @Column(name = "date_of_birth")
    private LocalDate DateOfBirth;

    private Location Location;
    @OneToMany(mappedBy = "advisor")
    private List<Advisee> advisees = new ArrayList<>();
}
