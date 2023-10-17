package week6;

import java.util.Scanner;

// Write a program to convert the upper case to lower case.
public class Pro9_UppertoLowerCase {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string in uppercase: ");
        String input = scanner.nextLine();

        // Convert the input string to lowercase
        String lowercaseString = input.toLowerCase();

        System.out.println("Uppercase string: " + input);
        System.out.println("Lowercase string: " + lowercaseString);

        scanner.close();

    }
}


