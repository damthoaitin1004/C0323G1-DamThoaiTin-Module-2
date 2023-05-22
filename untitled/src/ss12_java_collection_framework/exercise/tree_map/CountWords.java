package ss12_java_collection_framework.exercise.tree_map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> display = new java.util.TreeMap<>();
        System.out.println("Nhập 1 chuỗi các từ ngăn cách nhau bằng dấu cách");
        String string = scanner.nextLine();
        String[] arrayWords = string.toLowerCase().split(" ");
        int countWords;
        System.out.println("Các từ có trong chuỗi là: "+Arrays.toString(arrayWords));
        for (String s : arrayWords) {
            countWords = 0;
            for (String p : arrayWords) {
                if (s.equals(p)) {
                    countWords++;
                }
            }
            display.put(s, countWords);
        }
        Set<String> key = display.keySet();
        for (String k : key) {
            System.out.println("Các từ " + k + ", xuất hiện " + display.get(k) + " lần ");
        }
    }
}
