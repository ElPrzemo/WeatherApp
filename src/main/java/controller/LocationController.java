package controller;

import commonDB.LocationRepository;
import model.Location;
import service.LocationService;

import java.util.Set;

public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationRepository locationRepository) {
        this.locationService = new LocationService(locationRepository);
    }

    public void addLocation(Location location) {
        locationService.addLocation(location);
    }

    public void deleteLocation(Location location) {
        locationService.deleteLocation(location);
    }

    public Set<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
}

