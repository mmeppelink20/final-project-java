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

    public String stringReverse(String string) {
        String reverseString = "";

        for (int i = string.length() - 1; i >= 0; i--){
            reverseString += string.charAt(i);
        }

        return reverseString;
    }

    public Boolean isPalindrome(String string) {
        Boolean result = false;

        string = string.replaceAll(" ", "");
        string = string.toLowerCase();
        
        if(string.equals(stringReverse(string))){
            result = true;
        }

        return result;
    }

    public ArrayList<Object> stringStats(String string) {
        ArrayList<Object> stringStatsList = new ArrayList<Object>();
        String firstThreeChars = "";
        
        if(string.length() - 1 > 3){
            for (int i = 0; i < 3; i++){
                firstThreeChars += string.charAt(i);
            }
        } else {
            firstThreeChars = string;
        }

        stringStatsList.add(string.length());
        stringStatsList.add(firstThreeChars);
        stringStatsList.add(String.valueOf(string.charAt(string.length() - 1) ));
        stringStatsList.add(string.contains("i"));
        stringStatsList.add(string.toLowerCase());
        stringStatsList.add(isPalindrome(string));

        return stringStatsList;
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

        String userStrOne = InputUtility.getString("Enter a string: \n", in);
        String userStrTwo = InputUtility.getString("Enter another string: \n", in);

        ArrayList<Object> stringStatsList = new ArrayList<Object>();

        System.out.println();

        stringStatsList = stringStats(userStrOne);
        System.out.println("Length: " + stringStatsList.get(0) + 
                           "\nFirst 3 characters: " + stringStatsList.get(1) + 
                           "\nLast character: " + stringStatsList.get(2) + 
                           "\nContains the letter i: " + stringStatsList.get(3) + 
                           "\nLowercase: " + stringStatsList.get(4) + 
                           "\nIs a palindrome: " + stringStatsList.get(5)
                          );

        System.out.println();

        stringStatsList = stringStats(userStrTwo);
        System.out.println("Length: " + stringStatsList.get(0) + 
                           "\nFirst 3 characters: " + stringStatsList.get(1) + 
                           "\nLast character: " + stringStatsList.get(2) + 
                           "\nContains the letter i: " + stringStatsList.get(3) + 
                           "\nLowercase: " + stringStatsList.get(4) + 
                           "\nIs a palindrome: " + stringStatsList.get(5)
                          );
        System.out.println(Math.pow(5, 4));

        if (userStrOne.compareToIgnoreCase(userStrTwo) < 0) {
            System.out.println("\"" + userStrOne + "\" " + "comes alphabetically before " + userStrTwo + "\"");
        } else {
            System.out.println("\"" + userStrTwo + "\" " + "comes alphabetically before " + "\"" + userStrOne + "\"");
        }
 
    }

}