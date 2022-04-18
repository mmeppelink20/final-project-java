package src.chapter_assignments;
import java.util.Scanner;
import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;

public class Chapter1 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Sample Exercise"
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
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    sampleExercise(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");

        double numOne = InputUtility.getDouble("Enter a Number", in);
        double numTwo = InputUtility.getDouble("Enter another Number", in);

        if(numOne > numTwo) {
            System.out.println("Largest is: " + numOne);
        }
        else if(numTwo > numOne) {
            System.out.println("Largest is: " + numTwo);
        }
        else {
            System.out.println("Largest is: " + numOne);
        }
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        
        double numOne = InputUtility.getDouble("Enter a Number", in);
        double numTwo = InputUtility.getDouble("Enter another Number", in);

        double numAvg = (numOne + numTwo) / 2;
        
        System.out.printf("%.1f", numAvg);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        
        final double pi = Math.PI;
    
        double radius = InputUtility.getDouble("Enter the radius", in);
        
        double circumCalc = 2 * (pi * radius);
        double circleArea = pi * Math.pow(radius, 2);
        
        System.out.printf("Circumference: %.2f\nArea: %.2f\n", circumCalc, circleArea);

    }

    public void sampleExercise(Scanner in) {
        UIUtility.showMenuTitle("Sample Exercise");
        String name = InputUtility.getString("What is your name", in);
        System.out.printf("Hello, %s!\n", name);
    }
}