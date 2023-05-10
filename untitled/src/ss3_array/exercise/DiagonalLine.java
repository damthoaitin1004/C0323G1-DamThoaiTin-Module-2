package ss3_array.exercise;

import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[][] array;
        int sum;
        System.out.println("Enter size of array: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size][size];
        sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the element: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < size; i++) {
            sum += array[i][i];
        }
        System.out.println("the sum of the main diagonals is " + sum);
    }
}
