package javaprogramme;

import java.util.Scanner;
/**
 * Program to convert uppercase character to lowercase
 */
public class Programme09_ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User to enter an uppercase string
        System.out.print("Enter an uppercase string: ");
        String uppercaseString = scanner.nextLine();
        //Convert the string to lowercase
        String lowercaseString = uppercaseString.toLowerCase();
        //Display the result
        System.out.println("Uppercase string: " + uppercaseString);
        System.out.println("Lowercase string: " + lowercaseString);
        scanner.close();
    }
}
