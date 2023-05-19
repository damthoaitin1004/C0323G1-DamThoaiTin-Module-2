package ss11_stack_queue.exercise.binary;

import java.util.Scanner;
import java.util.Stack;

public class BinaryNumber {
    public static void main(String[] args) {
        int decimal;
        int tmp;
        String stringDisplay="";
        Stack<Integer> binary = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Decimal: ");
        decimal = Integer.parseInt(scanner.nextLine());
        while (true) {
            tmp = decimal % 2;
            binary.push(tmp);
            decimal = decimal / 2;
            if (decimal == 0) {
                break;



            }
        }
        for (int i = 0;!binary.isEmpty();i++) {
            stringDisplay +=binary.pop();
        }
        System.out.println(stringDisplay);
    }
}
