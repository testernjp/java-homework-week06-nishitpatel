package javaprogramme;

import java.text.DecimalFormat;
/**
 * Program to calculate and print the area and perimeter of a rectangle with the
 * given width and height
 */
public class Programme14_AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        //Calculate the area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);
        // Format the result to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedArea = df.format(area);
        String formattedPerimeter = df.format(perimeter);
        // Display the results
        System.out.println("Area is " + width + " = " + height + " = " + formattedArea);
        System.out.println("Perimeter is 2 * (" + width + " + " + height+ " ) = " + formattedPerimeter);
    }
}
