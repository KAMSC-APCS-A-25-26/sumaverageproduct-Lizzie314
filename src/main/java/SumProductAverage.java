/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);

        // Declare variables
        double num1, num2, num3, sum, prod, avg, quot;
        int numRuns;

        // Signature
        System.out.print("Lizzie\nAP CS A\nLewis 2.2-2.3 Arithmetic\n");

        // Prompt the user for the number of runs
        System.out.print("\nHow many times would you like to run the program?  ");
        numRuns = inputScanner.nextInt();

        // Repeat program a user-determined number of times
        for (int j=0; j<numRuns; j++)
        {
            // Prompt the user for two numbers
            System.out.print("\n\nEnter three numbers:  ");
            num1 = inputScanner.nextDouble();
            num2 = inputScanner.nextDouble();
            num3 = inputScanner.nextDouble();

            // Calculate the sum, product, average, and quotient of two numbers
            sum = num1 + num2 + num3;
            prod = num1 * num2 * num3;
            avg = (num1 + num2 + num3) / 3;
            quot = num1 / num2 / num3;

            // Display the sum, product, average, and quotient of two numbers
            System.out.print("\nThe sum of the three numbers is " + sum);
            System.out.print("\nThe product of the three numbers is " + prod);
            System.out.print("\nThe average of the three numbers is " + avg);
            System.out.print("\nThe quotient of the three numbers is " + quot + "\n");
        }

        // Exit the program
        System.out.print("\n\n\n");
        return;
    }
}
