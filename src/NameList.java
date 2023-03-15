import java.util.ArrayList;
import java.util.Scanner;

// NameList - Namnet antyder att den ska ha en lista på namn
public class NameList {

    // Skapa en arraylist för att hålla koll på personer
    ArrayList<Person> nameList = new ArrayList<>();
    Boolean exit = false;

    public void Run() {
        while (!exit) {
            // Använd menyklassen
            Menu.ShowMainMenu();
            Integer choice = Menu.AskForANumber(1, 4);
            switch (choice) {
                case 1 -> CreateAPerson();
                case 2 -> RemovePerson();
                case 3 -> ShowAllPersons();
                case 4 -> exit = true;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("Bye bye");
    }

    private void ShowAllPersons() {

        for (Person person : nameList) {
            System.out.println(person.toString());
        }
    }

    private void RemovePerson() {
        System.out.println("Remove a person");
        String name = new Scanner(System.in).nextLine();

        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getName().equalsIgnoreCase(name)) {
                nameList.remove(i);
                break;
            }
        }
    }

    private void CreateAPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        Integer age = scanner.nextInt();
        Person person = new Person(name, age);
        nameList.add(person);
        //scanner.close();
    }
}
