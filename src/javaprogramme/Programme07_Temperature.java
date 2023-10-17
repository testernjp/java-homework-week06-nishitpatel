package javaprogramme;


import java.util.Scanner;
/**
 * Program that takes a temperature value in Fahrenheit and coverts in to Celsius
 * using formula {(F - 32) * 5/9 = 0°C}
 */
public class Programme07_Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // User to enter the temperature in Fahrenheit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        // Display the result
        System.out.println("Temperature in Celsius: " + celsius + "°C");
        input.close();
    }
}
