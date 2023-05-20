package ss11_stack_queue.exercise.check_bracket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bracket bracket = new Bracket();
        String string;
        System.out.println("Please enter a expression: ");
        string = scanner.nextLine();

        System.out.println(Bracket.checkBracket(string));
    }
}
