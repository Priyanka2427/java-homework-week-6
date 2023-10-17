package week6;
  // Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

//Input Data:
  //Input a Decimal Number : 5
  //Expected Output
  //Binary number is: 101
 public class Pro17_Convert {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          // Input a decimal number
          System.out.print("Input a Decimal Number: ");
          int decimalNumber = scanner.nextInt();

          // Close the scanner
          scanner.close();

          // Convert decimal to binary
          String binaryNumber = Integer.toBinaryString(decimalNumber);

          // Display the binary number
          System.out.println("Binary number is: " + binaryNumber);
      }

}
