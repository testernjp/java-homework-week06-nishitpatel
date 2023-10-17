package javaprogramme;

import java.util.Scanner;
/**
 * Program that takes three number as input, calculates their average
 * and prints the result
 */
public class Programme13_AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //User enters the three values
        System.out.println("Enter the first number: ");
        double n1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double n2 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double n3 = scanner.nextDouble();
        //Calculate the average of the three numbers
        double average = (n1 + n2 + n3) / 3;
        // Display the result
        System.out.println("The average of the three numbers is: " + average);
        scanner.close();
    }
}