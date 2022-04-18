package src.chapter_assignments;
import java.util.Scanner;
import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;

public class Chapter2 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4"
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
                    exercise4(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 2 Menu.");
    }





    public void exercise1(Scanner in) { // determines whether an integer is even or odd
        UIUtility.showMenuTitle("Exercise 1");
        
        int isEven = InputUtility.getInt("Enter a Number", in);
        if (isEven % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public void exercise2(Scanner in) { // seperates whole values and decimal values; prints them on seperate lines
        UIUtility.showMenuTitle("Exercise 2");
        
        double userNum = InputUtility.getDouble("Please input a decimal number.", in);
        int userNumInt = (int) userNum;
        double userNumDecimal = (userNum - userNumInt) * 100;
        System.out.printf("%d\n%.0f", userNumInt, userNumDecimal);

    }

    public void exercise3(Scanner in) { // is prime
        UIUtility.showMenuTitle("Exercise 3");
        for(int i = 2; i <= 100; i++) {
            int k = 0;
            for(int j = 2; j <= 100; j++) {
                if(i % j == 0) {
                    k++;
                }
            }
            if(k == 1) {
                System.out.println(i);
            }
        }   
    }

    public void exercise4(Scanner in) { // program to find number of days, hours, minutes, and seconds from an inputed number of seconds
        UIUtility.showMenuTitle("Exercise 4");
        
        int userSec = InputUtility.getInt("Enter a number for seconds", in);
        int days = userSec / 86400;
        int hours = (userSec % 86400) / 3600;
        int minutes = ((userSec % 86400) % 3600) / 60;
        int seconds = (((userSec % 86400) % 3600) % 60);
        System.out.printf("%d Days\n%d Hours\n%d Minutes\n%d seconds", days, hours, minutes, seconds);
    }
}