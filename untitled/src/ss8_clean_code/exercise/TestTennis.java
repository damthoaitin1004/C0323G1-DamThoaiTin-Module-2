package ss8_clean_code.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namePlayerA;
        String namePlayerB;
        int scorePlayA;
        int scorePlayB;
        System.out.println("Please enter your playerA: ");
        namePlayerA = scanner.nextLine();
        System.out.println("Please enter your playerB: ");
        namePlayerB = scanner.nextLine();
        System.out.println("Please enter score playA: ");
        scorePlayA = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter score playB: ");
        scorePlayB = Integer.parseInt(scanner.nextLine());
        System.out.println(  TennisGame.getScore(namePlayerA,namePlayerB,scorePlayA,scorePlayB));

    }
}
