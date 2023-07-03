package com.razak.cdctracker.service;

import com.razak.cdctracker.model.Advisee;
import com.razak.cdctracker.model.Advisor;
import com.razak.cdctracker.model.Location;
import com.razak.cdctracker.repository.AdviseeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AdviseeService {
    private final AdviseeRepository adviseeRepository;

    public AdviseeService(AdviseeRepository adviseeRepository) {
        this.adviseeRepository = adviseeRepository;
    }

    public Advisee createAdvisee(String username, String email, String password, LocalDate dateOfBirth, Location location, Advisor advisor) {
        Advisee advisee = new Advisee();
        advisee.setUsername(username);
        advisee.setEmail(email);
        advisee.setPassword(password);
        advisee.setDateOfBirth(dateOfBirth);
        advisee.setLocation(location);
        advisee.setAdvisor(advisor);

        return adviseeRepository.save(advisee);
    }

    public List<Advisee> getAllAdvisees() {
        return adviseeRepository.findAll();
    }

}

