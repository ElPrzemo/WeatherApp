import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mainMenu(scanner);


    }

    public static void mainMenu(Scanner scanner) {
        System.out.println("------------------------------");
        System.out.println("Program do sprawdzania pogody");
        System.out.println("------------------------------");
        System.out.println("Wybierz opcje: \n 1. Edytor lokalizacji \n 2. Wyświetl pogodę \n 3. Statystyki");

        int nextStep = ScannerWithValidationMethods.scannerWithinGivenRange(scanner, 1, 3);

        if (nextStep == 1) {
            localizationSubMenu(scanner);
        } else if (nextStep == 2) {
            weatherSubMenu(scanner);
        } else if (nextStep == 3) {
            statisticsSubMenu(scanner);
        }
    }

    public static void localizationSubMenu(Scanner scanner) {
        System.out.println("Edytor lokalizacji");
        System.out.println("------------------------------");
        System.out.println("1. Dodaj lokalizację \n2. Usuń lokalizację \n3. Powrót do menu głównego");

        int nextStep = ScannerWithValidationMethods.scannerWithinGivenRange(scanner, 1, 3);

        if (nextStep == 1) {
            //dodaje lokalizacje
        } else if (nextStep == 2) {
            // usuwa lokalizacje
        } else if (nextStep == 3) {
            mainMenu(scanner);
        }
    }

    public static void weatherSubMenu(Scanner scanner) {
        System.out.println("podaj nazwe miasta");
        String userInput = scanner.nextLine();

        //sprawdzenie czy miasto jest zawarte w bazie danych
       // if userInput.toUpperCase().equals()
        //sdfsd
        ///sdfsdf

    }

    public static void statisticsSubMenu(Scanner scanner) {

    }


}
