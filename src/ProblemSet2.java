/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

         System.out.print("\nEnter your first name: ");
         String firstName = in.nextLine();

         System.out.print("Enter your last name: ");
         String lastName = in.nextLine();

         System.out.print("Enter your grade: ");
         int grade = in.nextInt();

         System.out.print("Enter your age: ");
         int age = in.nextInt();
         in.nextLine();

         System.out.print("Enter your hometown: ");
         String homeTown = in.nextLine();

         System.out.println("\nNAME     : " + firstName + " " + lastName + "\nGRADE    : " + grade + "\nAGE      : " + age + "\nHOMETOWN : " + homeTown);


        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         final int DOLLAR_CURRENCY = 100;
         final int QUARTER_CURRENCY = 25;
         final int DIME_CURRENCY = 10;
         final int NICKEL_CURRENCY = 5;
         final int PENNY_CURRENCY = 1;

         System.out.print("\nEnter a dollar amount: ");
         double inputCurrency = in.nextDouble();
         int pennyTotal = (int) (inputCurrency * 100);

         int dollarTotal = pennyTotal / DOLLAR_CURRENCY;
         pennyTotal = pennyTotal % DOLLAR_CURRENCY;

         int quarterTotal = pennyTotal / QUARTER_CURRENCY;
         pennyTotal = pennyTotal % QUARTER_CURRENCY;

         int dimeTotal = pennyTotal / DIME_CURRENCY;
         pennyTotal = pennyTotal % DIME_CURRENCY;

         int nickelTotal = pennyTotal / NICKEL_CURRENCY;
         pennyTotal = pennyTotal % NICKEL_CURRENCY;

         int pennyFinal = pennyTotal / PENNY_CURRENCY;
         pennyTotal = pennyTotal % PENNY_CURRENCY;

         System.out.println("\nDOLLARS  : " + dollarTotal);
         System.out.println("QUARTERS : " + quarterTotal);
         System.out.println("DIMES    : " + dimeTotal);
         System.out.println("NICKELS  : " + nickelTotal);
         System.out.println("PENNIES  : " + pennyFinal);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         final int TWENTY_CURRENCY = 2000;
         final int TEN_CURRENCY = 1000;
         final int FIVE_CURRENCY = 500;

         System.out.print("\nEnter a dollar amount: ");
         double inputCurrency2 = in.nextDouble();
         int pennyTotal2 = (int) (inputCurrency2 * 100);

         int twentyTotal = pennyTotal2 / TWENTY_CURRENCY;
         pennyTotal2 = pennyTotal2 % TWENTY_CURRENCY;

         int tenTotal = pennyTotal2 / TEN_CURRENCY;
         pennyTotal2 = pennyTotal2 % TEN_CURRENCY;

         int fiveTotal = pennyTotal2 / FIVE_CURRENCY;
         pennyTotal2 = pennyTotal2 % FIVE_CURRENCY;

         int dollarTotal2 = pennyTotal2 / DOLLAR_CURRENCY;
         pennyTotal2 = pennyTotal2 % DOLLAR_CURRENCY;

         int quarterTotal2 = pennyTotal2 / QUARTER_CURRENCY;
         pennyTotal2 = pennyTotal2 % QUARTER_CURRENCY;

         int dimeTotal2 = pennyTotal2 / DIME_CURRENCY;
         pennyTotal2 = pennyTotal2 % DIME_CURRENCY;

         int nickelTotal2 = pennyTotal2 / NICKEL_CURRENCY;
         pennyTotal2 = pennyTotal2 % NICKEL_CURRENCY;

         int pennyFinal2 = (int) (pennyTotal2 / PENNY_CURRENCY);
         pennyTotal2 = pennyTotal2 % PENNY_CURRENCY;

         int totalBills = twentyTotal + tenTotal + fiveTotal + dollarTotal2;
         int totalCoins = quarterTotal2 + dimeTotal2 + nickelTotal2 + pennyFinal2;

         System.out.println("\nBILLS : " + totalBills);
         System.out.println("COINS : " + totalCoins + "\n");

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         final int FEET_TO_INCH = 12;
         final int YARD_TO_INCH = 36;
         final int MILE_TO_INCH = 63360;

         System.out.print("Enter a number of inches: ");
         int inch = in.nextInt();

         int mile = inch / MILE_TO_INCH;
         inch = inch % MILE_TO_INCH;

         int yard = inch / YARD_TO_INCH;
         inch = inch % YARD_TO_INCH;

         int feet = inch / FEET_TO_INCH;
         inch = inch % FEET_TO_INCH;

         System.out.println("\nMILES  : " + mile);
         System.out.println("YARDS  : " + yard);
         System.out.println("FEET   : " + feet);
         System.out.println("INCHES : " + inch);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         final int KILO_TO_CENTI = 100000;
         final int METER_TO_CENTI = 100;

         System.out.print("\nEnter a number of centimeters: ");
         int centimeters = in.nextInt();

         int kilometers = centimeters / KILO_TO_CENTI;
         centimeters = centimeters % KILO_TO_CENTI;
         int meters = centimeters / METER_TO_CENTI;
         centimeters = centimeters % METER_TO_CENTI;

         System.out.println("\nKILOMETERS  : " + kilometers);
         System.out.println("METERS      : " + meters);
         System.out.println("CENTIMETERS : " + centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double circleDiameter = in.nextDouble();

         double circleRadius = circleDiameter / 2;
         double radiusSquared = circleRadius * circleRadius;
         double circleArea = Math.PI * radiusSquared;

         double circleCircumfrence = 2 * Math.PI * circleRadius;

         System.out.printf("\nAREA          : %.2f", circleArea);
         System.out.printf("\nCIRCUMFERENCE : %.2f\n", circleCircumfrence);



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */


         System.out.print("\nEnter a length: ");
         double length = in.nextDouble();

         System.out.print("Enter a width: ");
         double width = in.nextDouble();
         in.nextLine();

         double area = length * width;
         double perimeter = (length * 2) + (width * 2);
         double lengthSquared = length * length;
         double widthSquared = width * width;
         double diagonal = java.lang.Math.sqrt(lengthSquared + widthSquared);

         System.out.printf("\nAREA      : %,.2f", area);
         System.out.printf("\nPERIMETER : %,.2f", perimeter);
         System.out.printf("\nDIAGONAL  : %,.2f\n", diagonal);

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */


         System.out.print("\nEnter a side length: ");
         double sideLength = in.nextDouble();
         in.nextLine();

         final double SQUARE_ROOT = Math.sqrt(3);

         double hexPerimeter = sideLength * 6;
         double sideSquared = Math.pow(sideLength, 2);
         double hexArea = (((3 * SQUARE_ROOT) / 2) * sideSquared);

         System.out.printf("\nAREA      : %,.2f", hexArea);
         System.out.printf("\nPERIMETER : %,.2f\n", hexPerimeter);



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

        System.out.print("\nEnter a String: ");
        String inputString = in.next();

        int characterLength = Math.round(inputString.length()/2);
        String inputfirstHalf = inputString.substring(0,characterLength);
        String inputsecondHalf = inputString.substring(characterLength);

        System.out.println("\n" + inputsecondHalf + inputfirstHalf + "\n");

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

         System.out.print("Enter your first name: ");
         String firstName2 = in.next();

         System.out.print("Enter your middle name: ");
         String middleName2 = in.next();

         System.out.print("Enter your last name: ");
         String lastName2 = in.next();

         System.out.println("\n" + firstName2.substring(0,1) + middleName2.substring(0,1) + lastName2.substring(0,1));

        in.close();
    }
}
