package ss13_linear_binary.exercise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cho mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrayNumber = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Vui lòng nhập phần từ thứ " + (i + 1) + " cho mảng ");
            arrayNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arrayNumber);
        System.out.println("Nhập số cần tìm trong mảng: ");
        int numberSearch = Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.toString(arrayNumber));
        int result = binarySearch(arrayNumber,numberSearch);
        if (result == -1) {
            System.out.println("Phần tử không tồn tại.");
        } else {
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
        }
    }

    public static int binarySearch(int[] arrNum, int value) {
        int left = 0;
        int right = arrNum.length - 1;
        while (left <= right) {
            int middle = (left+right) / 2;
            if (arrNum[middle] == value) {
                return middle;
            } else if (arrNum[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
