package src.final_assignment;
import java.util.Scanner;

import src.utilities.UIUtility;
public class Ui {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Hanger hanger = new Hanger();
        int choice = 0;   
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Select an option\n";
            String[] menuOptions = {
                "Add a plane", "View planes", "Sort planes", "Update a plane", "Remove a plane", "Swap planes", 
            };

            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;

            switch (choice) {
                case 1:
                    hanger.add(scanner);
                    break;
                case 2:
                    hanger.printHanger();
                    break;
                case 3:
                    hanger.sortHanger();
                    break;
                case 4:
                    hanger.updatePlane(scanner);
                    break;
                case 5:
                    hanger.removePlane(scanner);
                    break;
                case 6:
                    hanger.swapPlane(scanner);
                    break;
                case 7:
                    break;

            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}
