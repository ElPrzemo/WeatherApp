import java.util.Scanner;

public class ScannerWithValidationMethods {

    public static boolean isNumberWithinRange(int min, int max, int userInput) {
        if (userInput >= min && userInput <= max) {
            return true;
        } else {
            return false;
        }
    }

    public static int scannerWithinGivenRange(Scanner scanner, int min, int max) {

        boolean userInputValidator = false;
        int userChoice = -1;

        while (!userInputValidator) {
            System.out.println("Wybierz opcję od " + min + " do " + max);

            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
                if (isNumberWithinRange(min, max, userChoice)) {
                    userInputValidator = true;
                } else {
                    System.out.println("Twój wybór jest poza zakresem, wybierz ponownie");
                }
            } else {
                System.out.println("To nie jest cyfra, wybierz ponownie");
                scanner.next();
            }
        }
        System.out.println("Wybrano opcje " + userChoice);
        return userChoice;
    }


}
