package week6;

import java.util.Scanner;

   //  Write a program to insert any temperature value in degree Fahrenheit and
   //convert to degree Celsius ((F − 32) × 5/9
public class Pro7_Temperature {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input from the user in Fahrenheit
        System.out.println("Enter temperature in degrees Fahrenheit:  ");
        double fahrenheit = scanner.nextDouble();

        // convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("Temperature in celsius is: " + celsius);

        scanner.close();
    }
}
