package model;

import javax.xml.stream.Location;
import java.time.LocalDate;


    public class Weather {
        private double temperature;
        private int pressure;
        private double humidity;
        private double windDirection;
        private int windSpeed;
        private Location locationWeather;
        private LocalDate date;

        public Weather() {
        }

        public Weather(LocalDate date, double temperature, int pressure, double humidity, double windDirection, int windSpeed, Location locationWeather) {
            this.date = date;
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
            this.windDirection = windDirection;
            this.windSpeed = windSpeed;
            this.locationWeather = locationWeather;
        }

        public LocalDate getDate() {
            return date;
        }

        public double getTemperature() {
            return temperature;
        }

        public int getPressure() {
            return pressure;
        }

        public double getHumidity() {
            return humidity;
        }

        public double getWindDirection() {
            return windDirection;
        }

        public int getWindSpeed() {
            return windSpeed;
        }

        public Location getLocationWeather() {
            return locationWeather;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public void setWindDirection(double windDirection) {
            this.windDirection = windDirection;
        }

        public void setWindSpeed(int windSpeed) {
            this.windSpeed = windSpeed;
        }

        public void setLocationWeather(Location locationWeather) {
            this.locationWeather = locationWeather;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Weather{" +
                    "date=" + date +
                    ", temperature=" + temperature +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", windDirection=" + windDirection +
                    ", windSpeed=" + windSpeed +
                    '}';
        }
    }

