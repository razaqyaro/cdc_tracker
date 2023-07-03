package com.razak.cdctracker.mappers;

import com.razak.cdctracker.DTOs.LocationDTO;
import com.razak.cdctracker.model.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper {

    public LocationDTO toLocationDto(Location location) {
        LocationDTO locationDto = new LocationDTO();
        locationDto.setCountry(location.getCountry());
        locationDto.setCity(location.getCity());

        return locationDto;
    }

    public Location toLocationEntity(LocationDTO locationDto) {
        Location location = new Location();
        location.setCountry(locationDto.getCountry());
        location.setCity(locationDto.getCity());

        return location;
    }
}

