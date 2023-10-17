package javaprogramme;
/**
 * Program declaring two static variables and one static method
 * Call two static variable into static method using print programme
 * Declare a main method
 * Call static method into main method and run the programme
 */
public class Programme02 {
    // Declare two static variables
    static int a = 100;
    static String mycar = "Honda";
    // Declare one static method
    public static void m1() {
        //Call both static variable in to static method inside print statement
        System.out.println(a);
        System.out.println(mycar);
    }
    // Declare main method
    public static void main(String[] args) {
        m1();
    }
}
