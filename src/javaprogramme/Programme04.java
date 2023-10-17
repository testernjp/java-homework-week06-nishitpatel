package javaprogramme;
/**
 * Declare two instance and two static variables
 * Declare one instance and one static method
 * Call all four variables into both instance and static methods inside print programme
 * Declare the main method
 * Call both instance and static methods into the main method and run the programme
 */
public class Programme04 {
    // instance variables
    int i1 = 100;
    String i2 = "I am an experienced ";
    // Static variables
    static int s1 = 500;
    static String s2 = "software tester";
    // Instance method
    public void m1() {
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(s1);
        System.out.println(s2);
    }
    // Static method
    public static void m2() {
        Programme04 obj1 = new Programme04();
        System.out.println(obj1.i1);
        Programme04 obj2 = new Programme04();
        System.out.println(obj2.i2);
        System.out.println(s1);
        System.out.println(s2);
    }
    // The main method
    public static void main(String[] args) {
        Programme04 p = new Programme04();
        p.m1();
        m2();
    }
}
