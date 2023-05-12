package ss4_oop.exercise.equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numberA;
        double numberB;
        double numberC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        System.out.print("Enter a: ");
         numberA = scanner.nextDouble();

        System.out.print("Enter b: ");
         numberB = scanner.nextDouble();
        System.out.print("Enter c: ");
         numberC = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        if (quadraticEquation.getDelta() < 0) {
            System.out.print("The equation has no real roots");
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.print("The equation has a roots: " + quadraticEquation.getSameRoot());
        } else {
            System.out.print("The equation has two roots: " + quadraticEquation.getRootA() + " and " + quadraticEquation.getRootB());
        }
    }
}

