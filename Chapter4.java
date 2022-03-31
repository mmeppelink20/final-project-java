import java.math.BigInteger;
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

        validateDenominator(denominator);
        this.denominator = denominator;
    }

    public static int greatestCommonDivisor(int num1, int num2) {
        BigInteger b1 = BigInteger.valueOf(num1);
        BigInteger b2 = BigInteger.valueOf(num2);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public String mixedNumber(){ 
        String mixedNumber;

        Fraction fraction = simplify();

        int num = fraction.getNumerator();
        int den = fraction.getDenominator();

        //TODO

        

        
        return mixedNumber;
    }
    public Fraction simplify() {
        Fraction simplified = new Fraction(numerator, denominator);

        int gcd = greatestCommonDivisor(numerator, denominator);

        int simpNum = numerator / gcd;
        int simpDen = denominator / gcd;

        if (simpNum < 0 && simpDen < 0) {
            simpNum = Math.abs(simpNum);
            simpDen = Math.abs(simpDen);
        }

        if (simpNum > 0 && simpDen < 0) {
            simpNum *= -1;
            simpDen = Math.abs(simpDen);
        }

        simplified.setNumerator(simpNum);
        simplified.setDenominator(simpDen);

        return simplified;
    }

    @Override
    public String toString() {
        String fraction;

        fraction = numerator + "/" + denominator;

        return fraction;
    }

    private void validateDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator cannot be 0.");
        }
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
        validateDenominator(denominator);
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
                    "Exercise 1",
                    "Exercise 2",
                    "Exercise 3",
                    "Exercise 4",
                    "Exercise 5",
                    "Exercise 6",
                    "Exercise 7",
                    "Exercise 8",
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
                case 5:
                    exercise5(in);
                    break;
                case 6:
                    exercise6(in);
                    break;
                case 7:
                    exercise7(in);
                    break;
                case 8:
                    exercise8(in);
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

        try {
            Fraction fraction = new Fraction(3, 0);
            int i = 0;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Fraction fraction = new Fraction();

        try {
            fraction.setDenominator(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4");

        System.out.println(Fraction.greatestCommonDivisor(75, 45));

        System.out.println(Fraction.greatestCommonDivisor(2, 4));

        System.out.println(Fraction.greatestCommonDivisor(5, 7));
    }

    public void exercise5(Scanner in) {
        UIUtility.showMenuTitle("Exercise 5");

        Fraction fraction1 = new Fraction(75, 45);
        System.out.println("Expected: 5/3: " + fraction1.simplify().toString());

        Fraction fraction2 = new Fraction(2, 4);
        System.out.println("Expected: 1/2: " + fraction2.simplify().toString());

        Fraction fraction3 = new Fraction(5, 7);
        System.out.println("Expected: 5/7: " + fraction3.simplify().toString());

        Fraction fraction4 = new Fraction(-2, 4);
        System.out.println("Expected:-1/2:" + fraction4.simplify().toString());

        Fraction fraction5 = new Fraction(2, -4);
        System.out.println("Expected:-1/2:" + fraction5.simplify().toString());

        Fraction fraction6 = new Fraction(-2, -4);
        System.out.println("Expected: 1/2: " + fraction6.simplify().toString());
    }

    public void exercise6(Scanner in) {
        UIUtility.showMenuTitle("Exercise 6");
        
    }

    public void exercise7(Scanner in) {
        UIUtility.showMenuTitle("Exercise 7");
    }

    public void exercise8(Scanner in) {
        UIUtility.showMenuTitle("Exercise 8");
    }

}
