package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wight: ");
         width = scanner.nextFloat();
        System.out.println("Enter height: ");
         height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: "+ area);
    }
}
