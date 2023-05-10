package ss3_array.exercise;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        int addNumber, indexNumber;

        System.out.println("Enter size of array: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size + 2];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter your element of array " + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
            System.out.println(array[i]);
        }
        System.out.print("enter a push number into the array: ");
        addNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the index you want to add: ");
        indexNumber = Integer.parseInt(scanner.nextLine());
        if (indexNumber >= 0) {
            for (int i = 0; i < array.length; i++) {
                if (indexNumber == i) {
                    for (int j = array.length - 1; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (indexNumber == i) {
                    array[i] = addNumber;
                }
            }
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }
        } else {
            System.out.println("Unable to insert element into array.");
        }
    }
}
