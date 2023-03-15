/*
    Skapa en class som hanterar personer med namn och ålder.'
    Skapa en meny som gör det möjligt att lägga till, ta bort, ändra och visa alla personer i listan.§
    Använd en ArrayList för att lagra personerna.
    Använd en loop för att visa menyn.
    Använd en switch för att hantera menyvalet.
    Använd en loop för att visa alla personer i listan.
    Main() ska vara minimal

    Tips
    * ListArray persons = new ArrayList();
    * Constructorn behöver inte vara så specifik då all input kommer från användaren
 */

public class Main {
    // Main ska hållas minimalt
    public static void main(String[] args) {
        System.out.println("Hello NameList!");

        // Skapa en instans av klassen NameList
        NameList namelist = new NameList();
        namelist.Run();
    }
}
