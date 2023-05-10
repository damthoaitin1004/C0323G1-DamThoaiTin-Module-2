package ss2_loop.exercise;


public class Prime {
    public static void main(String[] args) {
        int i;
        int count = 0;
        int number = 2;
        int divisor;
        while (count < 20) {
             divisor = 0;
            for (i = 1; i < number; i++) {
                if (number % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 1) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}
