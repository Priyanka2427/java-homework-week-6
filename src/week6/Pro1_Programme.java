package week6;

/**
 * Instance - object
 * Scope - within the class
 * Memory allocation - when object is created
 * memory - heap
 */
public class Pro1_Programme {
    // Declare two instance variables
    int a = 10;
    String name = "Priyanka";

    // Declare one instance method
    public void MyMethod() {
        System.out.println(a);
        System.out.println(name);
    }

    // Declare the Main method
    public static void main(String[] args) {
        Pro1_Programme obj = new Pro1_Programme();
        obj.MyMethod();

    }


}
