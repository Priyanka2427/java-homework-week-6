package week6;

import java.util.Scanner;

public class Pro5_Calculator {

    // static method for addition

    public static void addition(int a, int b) {

        int answer = a + b;
        System.out.println("Addition value is:" + answer);
    }

    // static method for substraction
    public static void substraction(int a, int b) {
        int answer = a - b;
        System.out.println("substraction value is:" + answer);
    }

    // instance method for multiplication
    public void multiplication(int a, int b) {
        int answer = a * b;
        System.out.println("multiplication value is:" + answer);
    }

    public void division(int a, int b) {

        int answer = a / b;
        System.out.println("division value is:" + answer);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value a:");
        int a = sc.nextInt();
        System.out.println("enter value b:");
        int b = sc.nextInt();
        addition(a, b);
        substraction(a, b);
        Pro5_Calculator t1 = new Pro5_Calculator();
        t1.division(a, b);
        t1.multiplication(a, b);
    }
}
