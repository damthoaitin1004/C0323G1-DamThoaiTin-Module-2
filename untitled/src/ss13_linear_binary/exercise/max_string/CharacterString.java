package ss13_linear_binary.exercise.max_string;

import java.util.LinkedList;
import java.util.Scanner;

public class CharacterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }

            }
            if (list.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(list);
            }
            list.clear();
        }
        for (Character c : maxString) {
            System.out.print(c);
        }
    }
}