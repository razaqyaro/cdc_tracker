package com.razak.cdctracker.service;

import com.razak.cdctracker.model.Advisor;
import com.razak.cdctracker.model.Location;
import com.razak.cdctracker.repository.AdvisorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AdvisorService {
    private final AdvisorRepository advisorRepository;

    public AdvisorService(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    public Advisor registerAdvisor(String username, String email, String password, LocalDate dateOfBirth, Location location) {
        Advisor advisor = new Advisor();
        advisor.setUsername(username);
        advisor.setEmail(email);
        advisor.setPassword(password);
        advisor.setDateOfBirth(dateOfBirth);
        advisor.setLocation(location);

        return advisorRepository.save(advisor);
    }

    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

}

