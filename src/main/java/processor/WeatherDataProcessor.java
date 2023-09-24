package processor;

import api.WeatherApiRepository;
import model.Weather;
import weatherDB.WeatherDatabase;

import javax.xml.stream.Location;
import java.io.IOException;
import java.time.LocalDate;

public class WeatherDataProcessor {

    WeatherDatabase weatherDatabase = WeatherDatabase.getInstance();
    Location location;
    private final WeatherApiRepository apiRepository1;
    private final WeatherApiRepository apiRepository2;
    private final WeatherApiRepository apiRepository3;

    public WeatherDataProcessor(String apiKey1, String apiKey2, String apiKey3) {
        this.apiRepository1 = new WeatherApiRepository(apiKey1);
        this.apiRepository2 = new WeatherApiRepository2(apiKey2);
        this.apiRepository3 = new WeatherApiRepository3(apiKey3);
    }

    public Weather getAveragedWeatherData(String city, LocalDate date) throws IOException {
        Weather dataFromSource1 = apiRepository1.getWeather(city, date);
        Weather dataFromSource2 = apiRepository2.getWeather(city, date);
        Weather dataFromSource3 = apiRepository3.getWeather(city, date);
        Weather averagedData = new Weather();


        double averagedTemperature = (dataFromSource1.getTemperature() + dataFromSource2.getTemperature() + dataFromSource3.getTemperature()) / 3.0;
        double averagedPressure = (dataFromSource1.getPressure() + dataFromSource2.getPressure() + dataFromSource3.getPressure()) / 3.0;
        int averagedHumidity = (int) ((dataFromSource1.getHumidity() + dataFromSource2.getHumidity() + dataFromSource3.getHumidity()) / 3);
        String averagedWindDirection = calculateAveragedWindDirection(dataFromSource1, dataFromSource2, dataFromSource3);
        int averagedWindSpeed = (dataFromSource1.getWindSpeed() + dataFromSource2.getWindSpeed() + dataFromSource3.getWindSpeed()) / 3;


        averagedData.setTemperature(averagedTemperature);
        averagedData.setPressure(averagedPressure);
        averagedData.setHumidity(averagedHumidity);
        averagedData.setWindSpeed(averagedWindSpeed); /////////// JAK UŚREDNIĆ KIERUNEK WIATRU
        averagedData.setWindDirection(averagedWindDirection);
        averagedData.setLocation(city);
        averagedData.setDate(date);

        weatherDatabase.addToDatabase(model.Location, averagedData);
        return averagedData;

    }
}

