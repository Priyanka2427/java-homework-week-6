package week6;

import java.util.Scanner;
  /*Write a Java program to print the sum (addition), multiply, subtract, divide and
   */

  //remainder of two numbers.
  //Test Data:
  //Input first number: 125
  //Input second number: 24
  //Expected Output :
  //125 + 24 = 149
  //125 - 24 = 101
  //125 x 24 = 3000
  //125 / 24 = 5
  //125 mod 24 = 5
public class Pro18_TwoNumbers {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          // Input the first number
          System.out.print("Input first number: ");
          double num1 = input.nextDouble();

          // Input the second number
          System.out.print("Input second number: ");
          double num2 = input.nextDouble();

          // Perform arithmetic operations
          double sum = num1 + num2;
          double difference = num1 - num2;
          double product = num1 * num2;
          double division = num1 / num2;
          double remainder = num1 % num2;

          // Display the results
          System.out.println(num1 + " + " + num2 + " = " + sum);
          System.out.println(num1 + " - " + num2 + " = " + difference);
          System.out.println(num1 + " x " + num2 + " = " + product);
          System.out.println(num1 + " / " + num2 + " = " + division);
          System.out.println(num1 + " mod " + num2 + " = " + remainder);

          input.close();

      }
}
