package ss3_array.exercise;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]array;
        int size;
        int addNumber,indexNumber;
        array = new int[2];
        System.out.println("Enter size of array: ");
        size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size;i++){
            System.out.print("Enter your element of array " + (i + 1) + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
            System.out.println(array[i]);
        }
        System.out.print("enter a push number into the array: ");
        addNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the index you want to add: ");
        indexNumber=Integer.parseInt(scanner.nextLine());

    }
}
