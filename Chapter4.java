import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    Fraction() {
        numerator = 1;
        denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        String fraction;
        
        fraction = numerator + "/" + denominator;

        return fraction;
    }

    public void validateDenominator(int denominator) {
        //here https://talon.kirkwood.edu/d2l/le/content/156736/Home
        //fraction class - part 3
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

}


public class Chapter4 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 4 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4", "Exercise 5", "Exercise 6", "Exercise 7", "Exercise 8"
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
        System.out.println("\nExiting Chapter 4 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");

        Fraction fraction = new Fraction();
        System.out.println(fraction.toString());
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");

        Fraction fraction = new Fraction(27, 6);

        System.out.println(fraction.toString());
        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDenominator());

        fraction.setNumerator(30);
        fraction.setDenominator(45);

        System.out.println(fraction.toString());
        

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");

    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");

    }

    public void exercise5(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");

    }

    public void exercise6(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");

    }

    public void exercise7(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");

    }

    public void exercise8(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");

    }

}