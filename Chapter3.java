import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Chapter3 implements TaskHandler {
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

            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 3 Menu.");
    }





    public void exercise1(Scanner in) { 
        UIUtility.showMenuTitle("Exercise 1");

        int userNumA = InputUtility.getInt("Enter two numbers: ", in);
        int userNumB = InputUtility.getInt("", in);

        
        if(userNumB < userNumA) {
            int tempNum = userNumB;
            userNumB = userNumA;
            userNumA = tempNum;
        }

        for(int i = userNumA; i < userNumB; i++) {
            if(i % userNumB == 0) {
                break;
            }
            if(i % 2 == 0) {
                System.out.println(i);
            }

        }
        

    }

    public void exercise2(Scanner in) { // not the most efficient way to do this, but I wanted to use ArrayLists :)
        UIUtility.showMenuTitle("Exercise 2");
        ArrayList<Integer> aryLst = new ArrayList<Integer>();

        System.out.println("Enter some numbers (enter \"S\" to stop):");

        while(true) {
            String userInput = InputUtility.getString("", in);

            try{
                if(userInput.toLowerCase().equals("s") || userInput.toLowerCase().equals("stop")) {
                    break;
                }
                else {
                    aryLst.add(Integer.parseInt(userInput));
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input.");
            }
            
        }

        Collections.sort(aryLst);

        int arySum = 0;

        for(int i = 0; i < aryLst.size(); i++) {
            arySum += aryLst.get(i);
        }

        double aryAvg = arySum / (double) aryLst.size();
        int aryMax = aryLst.get(aryLst.size() - 1);
        int aryMin = aryLst.get(0);

        System.out.printf("\nSum: %d\nCount: %d\nAverage: %.2f\nHighest: %d\nLowest: %d\n", arySum, aryLst.size(), aryAvg, aryMax, aryMin);
    }

    public void exercise3(Scanner in) { 
        UIUtility.showMenuTitle("Exercise 3");
  
    }

}