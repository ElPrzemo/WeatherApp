package org.example;

import api.WeatherApiRepository;
import api.WeatherApiRepository;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String apiKey = "access_key=b6d208108850ccdc37f2f80fd3ec69ac";

        WeatherApiRepository weatherApiRepository = new WeatherApiRepository(apiKey);


        LocalDate date = LocalDate.of(2023, 9, 22);

        try {
            String weatherData = weatherApiRepository.getWeather("Berlin", date);
            System.out.println(weatherData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
