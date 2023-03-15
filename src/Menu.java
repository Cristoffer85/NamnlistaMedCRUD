import java.util.Scanner;

// Hjälpklass för att skapa menyer
public class Menu {
    // Visa menyn
    public static void ShowMainMenu() {
        System.out.println("1. Add person");
        System.out.println("2. Remove person");
        System.out.println("3. Show all persons");
        System.out.println("4. Exit");
    }

    // Fråga efter ett nummer
    public static Integer AskForANumber(Integer min, Integer Max)
    {
        Integer choice=0;
        while (choice < min || choice > Max) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between " + min + " and " + Max);
            choice = scanner.nextInt();
            //scanner.close();
        }
        return choice;
    }
}