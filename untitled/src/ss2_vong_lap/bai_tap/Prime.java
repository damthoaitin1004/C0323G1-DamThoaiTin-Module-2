package ss2_vong_lap.bai_tap;

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int i;
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
