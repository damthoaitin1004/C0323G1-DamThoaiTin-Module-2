package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, hundred, tent, unit, numberTent;
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        hundred = number / 100;
        tent = (number - hundred * 100) / 10;
        unit = (number % 100) % 10;
        numberTent = number % 100;
        if (number != 0) {
            if (numberTent == 0) {
                switch (hundred) {
                    case 1:
                        System.out.print("One hundred");
                        break;
                    case 2:
                        System.out.print("Two hundred");
                        break;
                    case 3:
                        System.out.print("Three hundred");
                        break;
                    case 4:
                        System.out.print("Four hundred");
                        break;
                    case 5:
                        System.out.print("Five hundred");
                        break;
                    case 6:
                        System.out.print("Six hundred");
                        break;
                    case 7:
                        System.out.print("Seven hundred");
                        break;
                    case 9:
                        System.out.print("Eight hundred");
                        break;

                }
            } else {
                switch (hundred) {
                    case 1:
                        System.out.print("One hundred and ");
                        break;
                    case 2:
                        System.out.print("Two hundred and ");
                        break;
                    case 3:
                        System.out.print("Three hundred and ");
                        break;
                    case 4:
                        System.out.print("Four hundred and ");
                        break;
                    case 5:
                        System.out.print("Five hundred and ");
                        break;
                    case 6:
                        System.out.print("Six hundred and ");
                        break;

                    case 7:
                        System.out.print("Seven hundred and ");
                        break;
                    case 8:
                        System.out.print("Eight hundred and ");
                        break;
                    case 9:
                        System.out.print("Nine hundred and ");
                        break;
                }
                if (numberTent > 9 && numberTent < 20) {
                    switch (numberTent) {
                        case 10:
                            System.out.print("ten ");
                            break;
                        case 11:
                            System.out.print("eleven ");
                            break;
                        case 12:
                            System.out.print("twelve ");
                            break;
                        case 13:
                            System.out.print("thirteen ");
                            break;
                        case 14:
                            System.out.print("fourteen ");
                            break;
                        case 15:
                            System.out.print("fifteen ");
                            break;
                        case 16:
                            System.out.print("sixteen ");
                            break;
                        case 17:
                            System.out.print("seventeen ");
                            break;
                        case 18:
                            System.out.print("eighteen ");
                            break;
                        case 19:
                            System.out.print("nineteen ");
                            break;
                    }
                } else {
                    switch (tent) {
                        case 2:
                            System.out.print("twenty ");
                            break;
                        case 3:
                            System.out.print("thirty ");
                            break;
                        case 4:
                            System.out.print("forty ");
                            break;
                        case 5:
                            System.out.print("fifty ");
                            break;
                        case 6:
                            System.out.print("sixty ");
                            break;
                        case 7:
                            System.out.print("seventy ");
                            break;
                        case 8:
                            System.out.print("eighty ");
                            break;
                        case 9:
                            System.out.print("ninety ");
                            break;
                    }
                    switch (unit) {
                        case 1:
                            System.out.print("one ");
                            break;
                        case 2:
                            System.out.print("two ");
                            break;
                        case 3:
                            System.out.print("three ");
                            break;
                        case 4:
                            System.out.print("four ");
                            break;
                        case 5:
                            System.out.print("five ");
                            break;
                        case 6:
                            System.out.print("six ");
                            break;
                        case 7:
                            System.out.print("seven ");
                            break;
                        case 8:
                            System.out.print("eight ");
                            break;
                        case 9:
                            System.out.print("nine ");
                            break;
                    }
                }
            }
        } else {
            System.out.print("zero ");
        }
    }
}
