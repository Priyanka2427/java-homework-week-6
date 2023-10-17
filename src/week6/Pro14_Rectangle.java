package week6;
   // Test Data:
//Width = 5.5 Height = 8.5
//Expected Output:
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

public class Pro14_Rectangle {
    public static void main(String[] args) {
        float width = 5.6f;
        float height = 8.5f;

        // Calculate the area of the rectangle
        double area = width * height;

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (width + height);

        // Display the results
        System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", area));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter));
    }
}
