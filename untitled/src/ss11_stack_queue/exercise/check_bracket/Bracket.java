package ss11_stack_queue.exercise.check_bracket;

import java.util.Arrays;
import java.util.Stack;

public class Bracket {

        public static boolean checkBracket( String string){
        String[] arrayString = new String[string.length()];
        Stack bracket = new Stack<>();
        arrayString = string.split("");
         for (String a : arrayString) {
            if (a.equals( "(")) {
                bracket.push(a);
            }
            if (a.equals(")")) {
                if (bracket.size() == 0) {
              return false;
                } else {
                    bracket.pop();
                }
            }
        }
        if (bracket.size() > 0) {
            return false;
        } else {
            return true;
        }}
}

