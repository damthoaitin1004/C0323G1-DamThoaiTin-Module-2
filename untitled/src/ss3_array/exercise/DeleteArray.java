package ss3_array.exercise;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int deleteNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your size of array: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter your element of array " + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
            System.out.println(array[i]);
        }
        System.out.print("Enter the number to delete from the array");
        deleteNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            if (deleteNumber == array[i]) {
                for (int j = i; j < size-1 ; j++) {
                    array[j] = array[j + 1];

                }
            }

        }  array[size - 1] = 0;
        for (int e = 0; e < array.length; e++) {
            System.out.print(array[e] + ", ");
        }
    }

}

