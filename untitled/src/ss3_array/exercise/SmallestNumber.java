package ss3_array.exercise;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int minNumber;
        int[] array;
        System.out.println("Enter size of array: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        minNumber = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }

        }
        System.out.println("The smallest number is: " + minNumber);
    }
}
