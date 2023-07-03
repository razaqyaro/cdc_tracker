package com.razak.cdctracker.mappers;

import com.razak.cdctracker.DTOs.AdviseeDTO;
import com.razak.cdctracker.model.Advisee;
import org.springframework.stereotype.Component;

@Component
public class AdviseeMapper {
    public AdviseeDTO toAdviseeDto(Advisee advisee) {
        AdviseeDTO adviseeDto = new AdviseeDTO();
        adviseeDto.setId(advisee.getId());
        adviseeDto.setUsername(advisee.getUsername());
        adviseeDto.setEmail(advisee.getEmail());
        adviseeDto.setDateOfBirth(advisee.getDateOfBirth());
        adviseeDto.setLocation(advisee.getLocation());
        adviseeDto.setAdvisor(advisee.getAdvisor());

        return adviseeDto;
    }
    public Advisee toAdviseeEntity(AdviseeDTO adviseeDto) {
        Advisee advisee = new Advisee();
        advisee.setId(adviseeDto.getId());
        advisee.setUsername(adviseeDto.getUsername());
        advisee.setEmail(adviseeDto.getEmail());
        advisee.setDateOfBirth(adviseeDto.getDateOfBirth());
        advisee.setLocation(adviseeDto.getLocation());

        return advisee;
    }
}

