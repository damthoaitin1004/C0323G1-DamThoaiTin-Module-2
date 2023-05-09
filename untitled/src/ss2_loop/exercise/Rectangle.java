package ss2_loop.exercise;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hight = 4;
        int wight = 6;
        int choseMenu;
        System.out.println("Menu: ");
        System.out.println("1.Print the rectangle ");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");
        System.out.println("3.Print isosceles triangle ");
        System.out.println("4.Exit ");
        System.out.println("Please select number ");

        choseMenu = Integer.parseInt(scanner.nextLine());
        switch (choseMenu) {
            case 3:
                for (int i = 0; i < hight; i++) {
                    for (int j = hight; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 1:
                for (int i = 0; i < hight; i++) {
                    for (int j = 0; j < wight; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 0; i <= hight; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < hight; i++) {
                    for (int j = 0; j < hight * 2 - 1; j++) {
                        if (j >= hight - i - 1 && j <= hight + i - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            case 4:
                break;
        }
    }
}
