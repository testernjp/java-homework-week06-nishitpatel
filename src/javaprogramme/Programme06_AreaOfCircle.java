package javaprogramme;

import java.util.Scanner;
/**
 * Program that takes the radius of a circle and as input and
 * calculates its area using the formula A=Pi*r*r
 */
public class Programme06_AreaOfCircle {
    public static void main(String[] args) {
        //  Create scanner object
        Scanner scanner = new Scanner(System.in);
        // User enters radius as a double
        System.out.println("Enter the radius of the circle: ");
        // Read the radius as a double
        double radius = scanner.nextDouble();
        //Close scanner
        scanner.close();
        // Calculate the area of the circle
        double area = Math.PI * radius * radius;
        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
