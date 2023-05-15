package ss6_inheritance.exercise.cricle_cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        Cricle cricle = new Cricle("black", 2.6);
        Cylinder cylinder = new Cylinder(3.4, 2.5, "Red");
        System.out.println("press number to view information");
        System.out.println("1." + cricle.toString());
        System.out.println("2." + cylinder.toString());
        System.out.println("Enter number: ");
        number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            System.out.println(cricle.toString() + "\n" + "Area is: " + cricle.getAre() + "Perimeter is: " + cricle.getPerimeter());
        } else if (number == 2) {
            System.out.println(cricle.toString() + "\n" + "volumetric is: " + cricle.getPerimeter());
        }
    }
}
