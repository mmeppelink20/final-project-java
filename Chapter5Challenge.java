import java.util.Scanner;
import java.util.Arrays;

public class Chapter5Challenge implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 Challenge Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Task 1", "Task 2", "Task 3", "Task 4", "Task 5", "Task 6", "Task 7"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    task1(in);
                    break;
                case 2:
                    task2(in);
                    break;
                case 3:
                    task3(in);
                    break;
                case 4:
                    task4(in);
                    break;
                case 5:
                    task5(in);
                    break;
                case 6:
                    task6(in);
                    break;
                case 7:
                    task7(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Challenge Menu.");
    }

    public Integer[] getRandomIntegerArray() {
        int min = 5;
        int max = 10;
        int randomSize = min + (int) (Math.random() * ((max - min) + 1));
        Integer[] list = new Integer[randomSize];
        for (int i = 0; i < randomSize; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        return list;
    }

    public void task1(Scanner in) {
        UIUtility.showMenuTitle("Task 1");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        int userIndex = InputUtility.getIntInRange("Update value at index: ", 0, list.length - 1, in);

        int userNum = InputUtility.getInt("Enter an integer: ", in);

        list[userIndex] = userNum;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task2(Scanner in) {
        UIUtility.showMenuTitle("Task 2");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        int userIndex = InputUtility.getIntInRange("Insert value at index:", 0, list.length - 1, in);
        int userValue = InputUtility.getInt("Enter an integer: ", in);

        for (int i = list.length - 1; i > userIndex; i--) {
            list[i] = list[i - 1];
        }

        list[userIndex] = userValue;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task3(Scanner in) {
        UIUtility.showMenuTitle("Task 3");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        int userIndex = InputUtility.getIntInRange("Update value at index: ", 0, list.length - 1, in);

        list[userIndex] = null;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task4(Scanner in) {
        UIUtility.showMenuTitle("Task 4");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        int userIndex = InputUtility.getIntInRange("Swap value at index: ", 0, list.length - 1, in);

        int swapIndex = InputUtility.getIntInRange("With the value at index: ", 0, list.length - 1, in);

        int tempInt = list[swapIndex];
        list[swapIndex] = list[userIndex];
        list[userIndex] = tempInt;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task5(Scanner in) {
        UIUtility.showMenuTitle("Task 5");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        int lastIndex = list[list.length - 1];

        for (int i = list.length - 1; i > 0; i--) {
            list[i] = list[i - 1];
        }

        list[0] = lastIndex;

        System.out.println("Modified list: " + Arrays.toString(list));

    }

    public void task6(Scanner in) {
        UIUtility.showMenuTitle("Task 6");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        int firstIndex = list[0];

        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }

        list[list.length - 1] = firstIndex;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task7(Scanner in) {
        UIUtility.showMenuTitle("Task 7");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        for(int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }

        System.out.println("Modified list: " + Arrays.toString(list));
    }
}