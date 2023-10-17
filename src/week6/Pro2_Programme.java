package week6;

/**
 * static variable - class
 * scope - within the class
 * Memory allocation - when class is loaded
 * Store - non heap memory
 */
public class Pro2_Programme {
    //Declare two static variables
    static int a = 10;
    static String name = "Priyanka";

    //Declare one static method
    static void MyMethod() {
        System.out.println(a);
        System.out.println(name);
    }

    // Declare main method
    public static void main(String[] args) {

        MyMethod();
    }
}
