package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Change {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("Gia tri VND: "+quyDoi);
    }
}
