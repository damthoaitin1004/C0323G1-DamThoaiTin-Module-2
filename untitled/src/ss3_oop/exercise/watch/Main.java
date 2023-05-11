package ss3_oop.exercise.watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch clock = new StopWatch();
        System.out.println("Enter number 1 to start ");

        System.out.println("Press the number 1 to start");
        int start = scanner.nextInt();
        if (start==1){
            System.out.println("Start counting time");
            clock.start();
        }  System.out.println("Enter number 2 to end ");
        int end = scanner.nextInt();

        if (end==2){
            System.out.println("Time ended");
            clock.end();
            clock.getElapsedTime();
            System.out.println("The time passed is: "+clock.getElapsedTime());
            
        }
    }
}
