package javaprogramme;
/**
 * Program to swap two variables
 */
public class Programme15_SwapTwoVariables {
    public static void main(String[] args) {
        // Declare two variables
        int a = 5;
        int b = 10;
        // Print the original values
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        //Swap the values of variable
        a = a + b;
        b = a - b;
        a = a - b;
        // Print the swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
