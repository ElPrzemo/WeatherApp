import java.util.*;


public class LocationDatabase {
    private Set<Location> locations = new HashSet<>();

    public void addLocation(Location location) {
        locations.add(location);

    }public void removeLocation(Location location) {
        locations.remove(location);
    }
    public Set<Location> getLocations() {
        return locations;
    }

    public interface LocationComparator {
        List<Location> sortLocationsByCity(Set<Location> locations);
    }

    public static class CityComparator implements LocationComparator {
        @Override
        public List<Location> sortLocationsByCity(Set<Location> locations) {
            List<Location> sortedList = new ArrayList<>(locations);
            sortedList.sort(Comparator.comparing(Location::getCity));
            return sortedList;
        }
    }
}
