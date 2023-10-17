package week6;
   /*
    Write a Java program to add two binary numbers.
   Input Data:
   Input first binary number: 10
   Input second binary number: 11
   Expected Output:
   Sum of two binary numbers: 101
   */

import java.util.Scanner;

public class Pro16_TwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two numbers
        int sum = num1 + num2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);
    }
}



