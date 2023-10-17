package week6;

import java.util.Scanner;
  // Test Data: Input a number: 8
  //Expected Output :
  //8 x 1 = 8
  //8 x 2 = 16
  //8 x 3 = 24
  //...
  //8 x 10
public class Pro10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();

        for (int i = 1; i < 10; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);

        }
        input.close();
    }
}
