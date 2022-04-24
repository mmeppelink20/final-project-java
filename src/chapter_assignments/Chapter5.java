package src.chapter_assignments;

import java.util.ArrayList;
import java.util.Scanner;
import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;

public class Chapter5 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");

        ArrayList<Integer> oddList = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();

        System.out.println(
                "Enter numbers to be sorted into an odd and even list...\n\n Type \"s\" or \"stop\" to stop at any time...");

        while (true) {
            String userInput = InputUtility.getString("", in);
            if (userInput.toLowerCase().equals("s") || userInput.toLowerCase().equals("stop")) {
                break;
            } else {
                if (Integer.parseInt(userInput) % 2 == 0) {
                    evenList.add(Integer.parseInt(userInput));
                } else {
                    oddList.add(Integer.parseInt(userInput));
                }
            }
        }
        System.out.println("odd: " + oddList.toString() + "\neven: " + evenList.toString());
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");

    }

}