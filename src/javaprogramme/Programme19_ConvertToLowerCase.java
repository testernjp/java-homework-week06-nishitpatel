package javaprogramme;
/**
 * Program to convert a given upper case string to lower case
 */
public class Programme19_ConvertToLowerCase {
    public static void main(String[] args) {
        //  given input in upper case sting
        String inputString = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. ";
        // Convert the string to lower case
        String lowecaseString = inputString.toLowerCase();
        // Print the lower case string
        System.out.println("Original String: " + inputString);
        System.out.println("Lowercase String: " + lowecaseString);
    }

}
