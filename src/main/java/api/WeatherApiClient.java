package api;

import java.io.IOException;
import java.time.LocalDate;

public interface WeatherApiClient {


    String getWeather(String city, LocalDate date) throws IOException;
}
