package ss11_stack_queue.exercise.reverse;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        // Đảo ngược mảng
        int[] arrayInteger = {4, 3, 2, 1, 0};
        int sizeArr = arrayInteger.length;
        int[] arrReverse = new int[sizeArr];
        Stack<Integer> stackInteger = new Stack<>();
        for (Integer i : arrayInteger) {
            stackInteger.push(i);
        }
        System.out.println("Array is: " + Arrays.toString(arrayInteger));
        for (int i = 0; i < sizeArr; i++) {
            arrReverse[i] = stackInteger.pop();
        }
        System.out.println("array after reverse is: " + Arrays.toString(arrReverse));


      // Đảo ngược các từ của chuỗi

        String string= "Tin Thoại Đàm";
        String stringDisplay = "";
        Stack<String> wStack = new Stack<>();
        String[] wWorld =new String[string.length()] ;
        wWorld = string.split("\\s+");
        for (String i:wWorld ) {
            wStack.push(i);
        }
       int sizeString= wStack.size();
     for (int i = 0;i<sizeString;i++){
         stringDisplay += wStack.pop()+" ";
     }
        System.out.println(stringDisplay);
    }

}

