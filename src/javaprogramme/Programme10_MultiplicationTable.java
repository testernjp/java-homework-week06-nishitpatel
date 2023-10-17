package javaprogramme;

import java.util.Scanner;
/**
 * Program that takes a number as input and prints its multiplication table up to 10
 */
public class Programme10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User enters a number
        System.out.println("Input a number: ");
        int a = scanner.nextInt();
        // Print the multiplication table
        System.out.println("Multiplication table for "+ a + ":");
        for (int i = 1; i <= 10; i++){
            int result = a * i;
            System.out.println(a + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
