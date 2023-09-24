//package api;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.time.LocalDate;
//
//
//
//public class WeatherApiRepository3 implements WeatherApiClient {
//    private final String apiKey;
//
//    public WeatherApiRepository3(String apiKey) {
//        this.apiKey = apiKey;
//    }
//
//    public String getWeather(String city, LocalDate date) throws IOException {
//        String apiUrl = "http://api.weatherstack.com/historical?city=" + city + "&date=" + date + "&apiKey=" + apiKey + "&hourly=0";
//
//        URL url = new URL(apiUrl);
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//        connection.setRequestMethod("GET");
//
//        int responseCode = connection.getResponseCode();
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//            return response.toString();
//        } else {
//            throw new IOException("Błąd zapytania do API pogodowego: " + responseCode);
//        }
//    }
//}