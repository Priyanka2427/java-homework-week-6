package week6;
/**
 * Instance - static -object
 * static - static - Direct
 * static - instance - Direct
 */

   // Declare one static and one Instance variable
public class Pro3_Programme {
   int a = 10;
    static String name = "Priyanka";

    // Declare one instance method
    public void MyMethod() {
        System.out.println(a);
        System.out.println(name);
    }
    // Declare one static method
    static void M2() {
        Pro3_Programme p = new Pro3_Programme();
        System.out.println(name);
        System.out.println(p.a);
    }

    public static void main(String[] args) {
        Pro3_Programme t1 = new Pro3_Programme();
        t1.MyMethod();
        M2();
    }
}
