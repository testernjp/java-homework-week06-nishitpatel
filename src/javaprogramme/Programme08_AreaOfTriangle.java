package javaprogramme;

import java.util.Scanner;
/**
 * Program to calculate the area of a triangle using its base and height
 */
public class Programme08_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        // Calculate the area of the triangle
        double area = 0.5 * base * height;
        // Display the result
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}
