package ss3_oop.exercise.MachineFan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Scanner scanner = new Scanner(System.in);
        Fan fanA = new Fan(true, FAST, 10, "Yellow");
        Fan fanB = new Fan(false, MEDIUM, 5, "Red");
        System.out.println("Please choose fan\n");
        System.out.print("1.");
        System.out.println(fanA.toString());
        System.out.print("2.");
        System.out.println(fanB.toString());
        System.out.print("Enter number: ");
        int numberFan = Integer.parseInt(scanner.nextLine());
        if (numberFan == 1) {
            System.out.println(fanA.toString());
            System.out.println("press number 1 to change fan speed ");
            System.out.println("press number 2 to turn off/on the fan ");
            int numberInformation = Integer.parseInt(scanner.nextLine());
            if (numberInformation == 1) {
                System.out.println("1.Slow\n" +
                                "2.Medium\n" +
                                "3.Fast\n"+
                        "4.Turn off the fan");
                int numberSpeed = Integer.parseInt(scanner.nextLine());
                if (numberSpeed == 1) {
                    fanA.SetSpeed(SLOW);
                    System.out.println(fanA.toString());
                } else if (numberSpeed == 2) {
                    fanA.SetSpeed(MEDIUM);
                    System.out.println(fanA.toString());
                } else if (numberSpeed == 3) {
                    fanA.SetSpeed(FAST);
                    System.out.println(fanA.toString());
                } else if (numberSpeed == 4) {
                    fanA.SetOn(false);
                    System.out.println(fanA.toString());
                }
            } else if (numberInformation == 2) {
                fanA.SetOn(false);
                System.out.println(fanA.toString());
            }
        } else if (numberFan == 2) {
            System.out.println(fanB.toString());
            System.out.println("press number 1 to change fan speed ");
            System.out.println("press number 2 to turn off/on the fan ");
            int numberInformationB = Integer.parseInt(scanner.nextLine());
            if (numberInformationB == 1) {
                System.out.println("1.Slow\n" +
                                "2.Medium\n" +
                                "3.Fast\n"+
                        "4.Turn off the fan");
                int numberSpeedB = Integer.parseInt(scanner.nextLine());
                if (numberSpeedB == 1) {
                    fanB.SetSpeed(SLOW);
                    System.out.println(fanB.toString());
                } else if (numberSpeedB == 2) {
                    fanB.SetSpeed(MEDIUM);
                    System.out.println(fanB.toString());
                } else if (numberSpeedB == 3) {
                    fanB.SetSpeed(FAST);
                    System.out.println(fanB.toString());
                } else if (numberSpeedB == 4) {
                    fanB.SetOn(true);
                    System.out.println(fanB.toString());
                }
            }else if (numberInformationB == 2) {
                fanB.SetOn(true);
                System.out.println(fanB.toString());
            }
        }

    }
}
