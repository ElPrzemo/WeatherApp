import java.util.concurrent.atomic.AtomicInteger;

public class Location {
    private static AtomicInteger idCounter = new AtomicInteger(0);
    private int id;
    private double latitude;
    private double longitude;
    private Country country;
    private City city;

    public Location(double latitude, double longitude, Country country, City city) {
        this.id = idCounter.incrementAndGet();
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Country getCountry() {
        return country;
    }

    public City getCity() {
        return city;
    }
}
