package javaprogramme;

import java.util.Scanner;
/**
 * Program to convert a decimal number to a binary number like this
 */
public class Programme17_DecimalToBinary {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // User enters a decimal number
        System.out.println("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        // Close scanner
        scanner.close();
        // Conversion of decimal to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        // Display the binary expression
        System.out.println("Binary number is: " + binaryNumber);
    }
}
