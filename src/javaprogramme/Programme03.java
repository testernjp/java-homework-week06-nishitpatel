package javaprogramme;
/**
 * Declare one instance and one static variable
 * Declare one instance and one static method
 * Call both instance and static variables into both instance and static methods inside print statement
 * Declare the main method
 * Call both instance and static methods into the main method and run the programme
 */
public class Programme03 {
    // Declare one instance and one static variable
    String v1 = "Hello, I am Instance";
    static String v2 = "Hello, I am Static";
    //Declare one instance method
    public void m1 (){
        // Call instance and static variable into the instance method inside the print statement
        System.out.println(v1);
        System.out.println(v2);
    }
    // Declare one static method
    public static void m2 (){
        // Call instance and static variable into the static method inside the print statement
        Programme03 obj = new Programme03();
        System.out.println(obj.v1);
        System.out.println(v2);
    }
    // Declare main method
    public static void main(String[] args) {
        // Call both instance and static methods into main method and run the programme
        Programme03 p = new Programme03();
        p.m1();
        m2();
    }
}
