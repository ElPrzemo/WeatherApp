import java.util.*;


public class LocationDatabase {
    private static Set<Location> locations = new HashSet<>();

    public static void addLocation(Location location) {
        locations.add(location);
    }

    public static Set<Location> getLocations() {
        return locations;
    }

    // Interfejs do sortowania po miastach
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