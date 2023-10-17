package week6;

import java.util.Scanner;

// Write a program to calculate the area of a triangle.
public class Pro8_Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter the length of the base of the triangle:  ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:  ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        scanner.close();

    }

}
