package console;

import commonDB.LocationDatabase; // Zakładam, że istnieje klasa LocationDatabase
import model.Location;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CityAddMenu {
    public static Location addLocation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************");
        System.out.println("Wpisz miasto:");
        String cityName = scanner.nextLine();
        System.out.println("*********************");

        System.out.println("*********************");
        System.out.println("Wpisz kraj: ");
        String countryName = scanner.nextLine();
        System.out.println("*********************");

        String regex = "^[-+]?([1-8]?[0-9](\\.[0-9]+)?|90(\\.0+)?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        double longitude = 0;
        double latitude = 0;

        do {
            System.out.println("*********************");
            System.out.println("Podaj długość geograficzną (format: [-]xx[.xxxxxx]): ");
            String longitudeInput = scanner.next();
            matcher = pattern.matcher(longitudeInput);

            if (matcher.matches()) {
                longitude = Double.parseDouble(longitudeInput);
                break; // Poprawny format, przerwij pętlę
            } else {
                System.out.println("Niepoprawny format. Spróbuj ponownie.");
            }
        } while (true);

        do {
            System.out.println("*********************");
            System.out.println("Podaj szerokość geograficzną (format: [-]xx[.xxxxxx]): ");
            String latitudeInput = scanner.next();
            matcher = pattern.matcher(latitudeInput);

            if (matcher.matches()) {
                latitude = Double.parseDouble(latitudeInput);
                break; // Poprawny format, przerwij pętlę
            } else {
                System.out.println("Niepoprawny format. Spróbuj ponownie.");
            }
        } while (true);

        System.out.println("*********************");
        System.out.println("Wprowadzone miasto: " + cityName);
        System.out.println("Wprowadzony kraj: " + countryName);
        System.out.println("Wprowadzona długość geograficzna: " + longitude);
        System.out.println("Wprowadzona szerokość geograficzna: " + latitude);
        System.out.println("*********************");


        Location location = new Location(cityName, countryName, latitude, longitude);


        LocationDatabase locationDatabase = LocationDatabase.getInstance();
        locationDatabase.addLocation(location);

        return location;
    }
}