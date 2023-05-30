package ss18_string_regex.exercise.name_class;

import ss18_string_regex.exercise.validate.Validate;

import java.util.Scanner;

public class CheckClasses {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String regexNameClass="[CAP]\\d{4}[GHKI]$";
        System.out.println("Nhập tên lớp kiểm tra xem tên lớp đã đúng vs định dạng chưa");
        String nameClass;
       do {
           System.out.println("Nhập tên lớp");
            nameClass = scanner.nextLine();
       }while (!Validate.checkInput(nameClass,regexNameClass));
        System.out.println("Oke");
    }
}
