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

         // System.out.print("\nEnter your first name: ");
         // String firstName = in.nextLine();
         //
         // System.out.print("Enter your last name: ");
         // String lastName = in.nextLine();
         //
         // System.out.print("Enter your grade: ");
         // int grade = in.nextInt();
         //
         // System.out.print("Enter your age: ");
         // int age = in.nextInt();
         // in.nextLine();
         //
         // System.out.print("Enter your hometown: ");
         // String homeTown = in.nextLine();
         //
         // System.out.println("\nNAME     : " + firstName + " " + lastName + "\nGRADE    : " + grade + "\nAGE      : " + age + "\nHOMETOWN : " + homeTown);


        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */



        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */



        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

<<<<<<< HEAD
         // System.out.print("\nEnter a length: ");
         // double length = in.nextDouble();
         //
         // System.out.print("Enter a width: ");
         // double width = in.nextDouble();
         // in.nextLine();
         //
         // double area = length * width;
         // double perimeter = (length * 2) + (width * 2);
         // double lengthSquared = length * length;
         // double widthSquared = width * width;
         // double diagonal = java.lang.Math.sqrt(lengthSquared + widthSquared);
         //
         // System.out.printf("\nAREA      : %,.2f", area);
         // System.out.printf("\nPERIMETER : %,.2f", perimeter);
         // System.out.printf("\nDIAGONAL  : %,.2f\n", diagonal);
=======
         System.out.print("\nEnter your length: ");
         double length = in.nextDouble();

         System.out.print("Enter your width: ");
         double width = in.nextDouble();
         in.nextLine();

         double area = length * width;
         double perimeter = (length * 2) + (width * 2);
         double lengthSquared = length * length;
         double widthSquared = width * width;
         double diagonal = java.lang.Math.sqrt(lengthSquared + widthSquared);

         System.out.println("\nAREA      : " + area + "\nPERIMETER : " + perimeter + "\nDIAGONAL  : " + diagonal);




>>>>>>> 81648bf93d2327781878fea853da7c97d68cd8ae

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

<<<<<<< HEAD
         System.out.print("\nEnter a side length: ");
         double sideLength = in.nextDouble();
         in.nextLine();

         final double SQUARE_ROOT = Math.sqrt(3);

         double hexPerimeter = sideLength * 6;
         double sideSquared = Math.pow(sideLength, 2);
         double hexArea = (((3 * SQUARE_ROOT) / 2) * sideSquared);

         System.out.printf("\nAREA      : %,.2f", hexArea);
         System.out.printf("\nPERIMETER : %,.2f\n", hexPerimeter);
=======
>>>>>>> 81648bf93d2327781878fea853da7c97d68cd8ae


        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
