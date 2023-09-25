package commonDB;

import model.Location;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LocationDatabase {
    private Set<Location> locationSet;

    public LocationDatabase() {
        locationSet = new TreeSet<>(new CityComparator());
    }

    public void addLocation(Location location) {
        locationSet.add(location);
    }

    public Set<Location> getAllLocations() {
        return locationSet;
    }

    private class CityComparator implements Comparator<Location> {
        @Override
        public int compare(Location location1, Location location2) {
            String city1 = String.valueOf(location1.getCity()); // Teraz powinno działać, jeśli klasa Location ma odpowiednią metodę getCity()
            String city2 = String.valueOf(location2.getCity());
            return city1.compareTo(city2);
        }
    }
}