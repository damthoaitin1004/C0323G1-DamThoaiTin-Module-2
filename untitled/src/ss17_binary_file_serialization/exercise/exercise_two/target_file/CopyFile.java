package ss17_binary_file_serialization.exercise.exercise_two.target_file;

import ss16_text_file.exercise.copy_file.source_file.Person;
import ss17_binary_file_serialization.exercise.exercise_one.model.Product;
import ss17_binary_file_serialization.exercise.exercise_two.source_file.Customer;
import ss17_binary_file_serialization.exercise.exercise_two.source_file.WriteAndReadFile;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customerList = WriteAndReadFile.ReadCustomerFromFile("E:\\codegym\\module_2\\untitled\\src\\ss17_binary_file_serialization\\exercise\\exercise_two\\source_file\\customer.dat");
        System.out.println("Khời tạo 1 file coppy từ customer.dat ");
        while (true) {
            System.out.println("Nhập đường dẫn bạn muốn khởi tạo file ");
            String stringPath = scanner.nextLine();
            if(stringPath.equals("")) {
                System.out.println("Sai duong dan");
                continue;
            }
            File coppyFile = new File(stringPath);
            if (coppyFile.exists()) {
                System.out.println("file đã tồn tại");
            } else {
                System.out.println("file chưa tồn tại băt đầu khởi tạo file");
                WriteAndReadFile.WriteCustomerFromFile(customerList, stringPath);
                System.out.println("File đã đc khởi tạo ");
                break;

            }

        }
    }
}
