package com.razak.cdctracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Table(name="advisees")
@Data
public class Advisee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Username;

    private String Email;

    private String Password;
    private Location Location;

    @Column(name = "date_of_birth")
    private LocalDate DateOfBirth;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor Advisor;
}
