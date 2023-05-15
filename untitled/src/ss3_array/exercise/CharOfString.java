package ss3_array.exercise;

import java.util.Scanner;

public class CharOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a string: ");
        String enterString = scanner.next();



        System.out.println("Enter the character to count: ");
        char character = scanner.next().charAt(0);
        for (int i = 0; i < enterString.length(); i++) {
            if (character == enterString.charAt(i)) {
                count++;
            }
        }
        System.out.println("the number of occurrences of " + character + " in the string is: " + count);
    }
}
