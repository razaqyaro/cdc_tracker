package com.razak.cdctracker.mappers;

import com.razak.cdctracker.DTOs.AdvisorDTO;
import com.razak.cdctracker.model.Advisor;
import org.springframework.stereotype.Component;

@Component
public class AdvisorMapper
{
    public AdvisorDTO toAdvisorDto(Advisor advisor) {
        AdvisorDTO advisorDTO = new AdvisorDTO();
        advisorDTO.setId(advisor.getId());
        advisorDTO.setUsername(advisor.getUsername());
        advisorDTO.setEmail(advisor.getEmail());
        advisorDTO.setDateOfBirth(advisor.getDateOfBirth());
        advisorDTO.setLocation(advisor.getLocation());

        return advisorDTO;
    }


    public Advisor toAdvisorEntity(AdvisorDTO advisorDto) {
        Advisor advisor = new Advisor();
        advisor.setId(advisorDto.getId());
        advisor.setUsername(advisorDto.getUsername());
        advisor.setEmail(advisorDto.getEmail());
        advisor.setDateOfBirth(advisorDto.getDateOfBirth());
        advisor.setLocation(advisorDto.getLocation());

        return advisor;
    }
}
