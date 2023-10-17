package javaprogramme;

import java.util.Scanner;
/**
 * Program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods
 * Declare two static and two instance methods
 */
public class Programme05_Calc {
    //Static methods with parameters
    public static void addition(double a, double b) {
        double result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }
    public static void subtraction(double a, double b) {
        double result = a - b;
        System.out.println("The subtraction of " + a + " and " + b + " is : " + result);
    }
    //Instance methods with parameters
    public void multiplication(double a, double b) {
        double result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }
    public void division(double a, double b) {
        double result = a / b;
        System.out.println("The division of " + a + " and " + b + " is : " + result);
    }
    //The main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme05_Calc obj = new Programme05_Calc();
        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        double b = scanner.nextDouble();
        addition(a, b);
        subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
        scanner.close();
    }
}
