package ss14_arrange.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SettingInsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cho mảng số nguyên");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrayNumber = new int[size];
        int element;
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử vị trí " + i);
            element = Integer.parseInt(scanner.nextLine());
            arrayNumber[i] = element;
        }
        System.out.println("Mảng trước khi được sắp xếp ");
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println("Mảng sau khi được sắp xếp theo thứ tự tăng dần");
        insertionSort(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));
    }

    public static void insertionSort(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
