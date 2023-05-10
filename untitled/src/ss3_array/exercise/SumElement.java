package ss3_array.exercise;

import java.util.Scanner;

public class SumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[][] array;
        int sum;
        int indexSum;
        System.out.println("Enter size of array: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the element: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Enter the column position to sum: ");
        indexSum = Integer.parseInt(scanner.nextLine());
        sum = 0;
        for (int i = 0; i < size; i++) {
            if (indexSum == i) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of the column is: " + sum);
    }
}
