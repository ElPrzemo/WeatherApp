package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Location {

    private static AtomicInteger idCounter = new AtomicInteger(0);
    private int id;
    private String city;
    private double latitude;
    private double longitude;
    private String country;

    public Location(String city, String country, double latitude, double longitude ) {
        this.id = idCounter.incrementAndGet();
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}