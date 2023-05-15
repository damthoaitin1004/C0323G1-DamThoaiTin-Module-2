package ss6_inheritance.exercise.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA;
        int sideB;
        int sideC;
        String color;
        System.out.println("enter information for Triangle");
        System.out.println("enter sideA for Triangle ");
        sideA = Integer.parseInt(scanner.nextLine());
        System.out.println("enter sideB for Triangle ");
        sideB = Integer.parseInt(scanner.nextLine());
        System.out.println("enter sideC for Triangle ");
        sideC = Integer.parseInt(scanner.nextLine());
        System.out.println("enter color for Triangle ");
        color = scanner.nextLine();
        if ((sideA > 0)&&(sideB>0)&&(sideC>0)&&(sideA <= sideB + sideC)&&(sideB <= sideA + sideC)&&(sideC <= sideB + sideA)) {
            Triangle triangle = new Triangle(color, true, sideA, sideB, sideC);
            System.out.println(triangle.toString());
        }else {
            System.out.println("This is not a Triangle");
        }
    }
}
