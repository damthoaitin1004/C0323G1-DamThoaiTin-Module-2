package ss3_oop.exercise.MachineFan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fanA = new Fan(true,3,10,"Yellow");
        Fan fanB = new Fan(false,2,5,"Red");
        System.out.println("Please choose fan\n");
        System.out.print("1.");
        System.out.println(fanA.toString());
        System.out.print("2.");
        System.out.println(fanB.toString());

    }
}
