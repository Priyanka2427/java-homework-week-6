package week6;
  // java program to swap two variables.

public class Pro15_SwapTwoVariables {
    public static void main(String[] args) {
// Declare and initialize two variables
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values of a and b
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
