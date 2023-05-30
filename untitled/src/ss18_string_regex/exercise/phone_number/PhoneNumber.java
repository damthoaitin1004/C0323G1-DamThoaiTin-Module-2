package ss18_string_regex.exercise.phone_number;

import ss18_string_regex.exercise.validate.Validate;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String regexPhoneNumber="^\\d{2}-0\\d{9}$";
        System.out.println("Kiểm tra định dạng số điện thoại");

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại");
            phoneNumber=scanner.nextLine();
        }while (!Validate.checkInput(phoneNumber,regexPhoneNumber));
        System.out.println("Oke");
    }
}
