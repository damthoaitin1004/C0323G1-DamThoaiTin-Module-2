package ss3_array.exercise;


import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        double MaxNumber = 0;
        System.out.println("Enter size of array: ");
        size = Integer.parseInt(scanner.nextLine());

        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = Integer.parseInt(scanner.nextLine());
                if (array[i][j] > MaxNumber) {
                    MaxNumber = array[i][j];
                }
            }
        }
        System.out.println("the largest number is: "+MaxNumber);
    }
}

