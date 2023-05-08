package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class MainFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 1:
                System.out.print("The month '1' has 31 days!");
                break;
            case 3:
                System.out.print("The month '3' has 31 days!");
                break;
            case 4:
                System.out.print("The month '4' has 30 days!");
                break;
            case 5:
                System.out.print("The month '5' has 31 days!");
                break;
            case 6:
                System.out.print("The month '6' has 30 days!");
                break;
            case 7:
                System.out.print("The month '7' has 31 days!");
                break;
            case 8:
                System.out.print("The month '8' has 31 days!");
                break;
            case 9:
                System.out.print("The month '9' has 30 days!");
                break;
            case 10:
                System.out.print("The month '10' has 31 days!");
                break;
            case 11:
                System.out.print("The month '11' has 30 days!");
                break;
            case 12:
                System.out.print("The month '12' has 31 days!");
                break;
            default:
                System.out.print("Invalid input!");
        }
    }
}
