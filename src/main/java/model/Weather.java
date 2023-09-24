package model;

import java.time.LocalDate;


    public class Weather {
        private double temperature;
        private double pressure;
        private double humidity;
        private double windDirection;
        private int windSpeed;
        private String locationWeather;
        private LocalDate date;

        public Weather() {
        }

        public Weather(LocalDate date, double temperature, int pressure, double humidity, double windDirection, int windSpeed, String locationWeather) {
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

        public double getPressure() {
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

        public String getLocationWeather() {
            return locationWeather;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public void setPressure(double pressure) {
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

        public void setLocation(String locationWeather) {
            this.locationWeather = locationWeather;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Weather{" +
                    "date=" + date +
                    ", temperature=" + temperature + "°C" +
                    ", pressure=" + pressure + " hPa" +
                    ", humidity=" + humidity + "%" +
                    ", windDirection=" + windDirection + "°" +
                    ", windSpeed=" + windSpeed + " km/h" +
                    '}';
        }}

