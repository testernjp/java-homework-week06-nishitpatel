package javaprogramme;

import java.util.Scanner;
/**
 * Program to add two binary numbers
 */
public class Programme16_AddTwoBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //User enters the first binary number
        System.out.println("Input first binary number: ");
        String b1 = scanner.nextLine();
        //User enters the second binary number
        System.out.println("Input second binary number: ");
        String b2 = scanner.nextLine();
        // Convert binary strings to integers and add them
        int d1 = Integer.parseInt(b1, 2);
        int d2 = Integer.parseInt(b2, 2);
        int sum = d1 + d2;
        //Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);
        // Display the result
        System.out.println("Sum of two binary numbers: " + binarySum);
        scanner.close();
    }
}
