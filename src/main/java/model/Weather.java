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


        public Weather(double temperature, double pressure, double humidity, double windDirection, int windSpeed, String locationWeather, LocalDate date) {
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
            this.windDirection = windDirection;
            this.windSpeed = windSpeed;
            this.locationWeather = locationWeather;
            this.date = date;
        }

        public Weather() {
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public double getWindDirection() {
            return windDirection;
        }

        public void setWindDirection(double windDirection) {
            this.windDirection = windDirection;
        }

        public int getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(int windSpeed) {
            this.windSpeed = windSpeed;
        }

        public String getLocationWeather() {
            return locationWeather;
        }

        public void setLocationWeather(String locationWeather) {
            this.locationWeather = locationWeather;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Weather{" +
                    "temperature=" + temperature +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", windDirection=" + windDirection +
                    ", windSpeed=" + windSpeed +
                    ", locationWeather='" + locationWeather + '\'' +
                    ", date=" + date +
                    '}';
        }
    }
