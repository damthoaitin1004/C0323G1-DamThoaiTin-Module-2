package ss11_stack_queue.exercise.palindrome;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
       String string ="able was I ere I saw 4elba6";
       String[]arrayString;
       arrayString = string.split("");
       String[]arrayStack=new String[string.length()];
       String[]arrayQueue=new String[string.length()];
        Stack<String> palindrome   = new Stack<>();
        Queue<String> stringsReverse   = new LinkedList<>();
        int count=0;

        for (int i = 0;i<arrayString.length;i++){
            palindrome.push(arrayString[i]);
            stringsReverse.add(arrayString[i]);
        }
        for (int j =0;j<string.length();j++){
            arrayStack[j]=palindrome.pop();
            arrayQueue[j]=stringsReverse.poll();
        }
        System.out.println(Arrays.toString(arrayStack));
        System.out.println(Arrays.toString(arrayQueue));
        for (int i = 0; i < string.length() ; i++) {
            if (arrayStack[i].equals(arrayQueue[i])){count++;}
        }

      if (count==string.length()){
          System.out.println("This is a Palindrome");
      }else {
          System.out.println("This is not a Palindrome");
      }
    }
}
