package controller;

import commonDB.LocationDatabase; // Importujesz odpowiednią klasę bazy danych
import model.Location;
import service.LocationService;

import java.util.Set;

public class LocationController {
    private final LocationService locationService;

    public LocationController() {
        // Używasz metody getInstance() do uzyskania instancji LocationDatabase
        this.locationService = new LocationService(LocationDatabase.getInstance());
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
