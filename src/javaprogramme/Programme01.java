package javaprogramme;
/**
 * Program declaring two instance variables and one instance method
 * Call two instance variable into instance method using print programme
 * Declare a main method
 * Call instance method into main method and run the programme
 */
public class Programme01 {
    // Declare two instance variables
    String variable1 = "Happy ";
    String variable2 = "New Year";
    // Declare one instance method
    public void party() {
        // Calling both instance variables into instance method inside print statement
        System.out.println(variable1 + variable2);
    }
    // Declare main method
    public static void main(String[] args) {
        //calling above instance method into main method and running programme
        Programme01 obj = new Programme01();
        obj.party();
    }

}
