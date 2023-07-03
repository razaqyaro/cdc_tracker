package com.razak.cdctracker.service;

import com.razak.cdctracker.model.Location;
import com.razak.cdctracker.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createLocation(String country, String city) {
        Location location = new Location();
        location.setCountry(country);
        location.setCity(city);

        return locationRepository.save(location);
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
