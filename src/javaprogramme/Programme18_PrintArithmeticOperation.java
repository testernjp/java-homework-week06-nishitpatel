package javaprogramme;

import java.util.Scanner;
/**
 * Program that takes two numbers as input and performs arithmetic operations
 * like sum, subtract, multiply, divide and calculates the remainder
 */
public class Programme18_PrintArithmeticOperation {
    public static void main(String[] args) {
        // Scanner object created
        Scanner scanner = new Scanner(System.in);
        // User enter first and second number
        System.out.println("Input first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int n2 = scanner.nextInt();
        // Perform arithmetic operations
        int sum = n1 + n2;
        int subtract = n1 - n2;
        int multiply = n1 * n2;
        int divide = n1 / n2;
        int mod = n1 % n2;
        // Print result
        System.out.println(n1 + " + " + n2 + " = " + sum);
        System.out.println(n1 + " - " + n2 + " = " + subtract);
        System.out.println(n1 + " * " + n2 + " = " + multiply);
        System.out.println(n1 + " / " + n2 + " = " + divide);
        System.out.println(n1 + " mod " + n2 + " = " + mod);
        // Close scanner
        scanner.close();
    }
}
