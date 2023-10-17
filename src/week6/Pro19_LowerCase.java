package week6;

//  Write a Java program to convert a given string into lowercase.
//Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
//Output: the quick brown fox jumps over the lazy dog.

public class Pro19_LowerCase {

    public static void main(String[] args) {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String lowercase = input.toLowerCase();

        System.out.println("Original String: " + input);
        System.out.println("String in Lowercase: " + lowercase);

    }
}
