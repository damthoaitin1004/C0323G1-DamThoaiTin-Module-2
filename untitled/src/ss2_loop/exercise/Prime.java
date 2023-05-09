package ss2_loop.exercise;


public class Prime {
    public static void main(String[] args) {
        int count;
        int number;
        int i;
        count = 0;
        number = 2;
        while (count < 20) {
            int count2 = 0;
            for (i = 1; i < number; i++) {
                if (number % i == 0) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}
