package ss3_array.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayA;
        int[] arrayB;
        int[] arrayC;
        int sizeA;
        int sizeB;
        int sizeC;
        System.out.println("Enter size of arrayA: ");
        sizeA = Integer.parseInt(scanner.nextLine());
        arrayA = new int[sizeA];
        for (int i = 0; i < sizeA; i++) {
            System.out.print("Enter your element of array " + (i + 1) + ":");
            arrayA[i] = Integer.parseInt(scanner.nextLine());
            System.out.println(arrayA[i]);
        }
        System.out.println("Enter size of arrayB: ");
        sizeB = Integer.parseInt(scanner.nextLine());
        arrayB = new int[sizeB];
        for (int i = 0; i < sizeB; i++) {
            System.out.print("Enter your element of arrayB " + (i + 1) + ":");
            arrayB[i] = Integer.parseInt(scanner.nextLine());
            System.out.println(arrayB[i]);
        }
        sizeC = sizeA + sizeB;
        arrayC = new int[sizeC];
        for (int i = 0; i < sizeA; i++) {
           arrayC[i]=arrayA[i];
        }
        for (int i = sizeA; i < sizeC; i++) {
                arrayC[i] = arrayB[i-sizeA];
        }
        for (int i = 0; i < sizeC; i++) {
            System.out.print(arrayC[i]);
        }
    }
}
