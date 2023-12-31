package controller;

import model.*;
import service.WeatherService;

import java.time.LocalDate;

public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public void getWeatherForLocation(String apiKey1, String apiKey2, String apiKey3, Location location, LocalDate date) {
        // Wywołanie usługi pogodowej i pobranie wyniku
        Weather weather = weatherService.getWeatherByCityAndDate(location, date);

        // Wyświetlenie wyniku w konsoli
        System.out.println("Pogoda w " + location.getCity() + " (" + location.getCountry() + "):");
        System.out.println("Temperatura: " + weather.getTemperature() + "°C");
        System.out.println("Ciśnienie: " + weather.getPressure() + " hPa");
        System.out.println("Wilgotność: " + weather.getHumidity() + "%");
        System.out.println("Kierunek wiatru: " + weather.getWindDirection() + "°");
        System.out.println("Prędkość wiatru: " + weather.getWindSpeed() + " km/h");


    }}