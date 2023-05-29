package ss17_binary_file_serialization.exercise.exercise_one.controller;

import ss17_binary_file_serialization.exercise.exercise_one.exception.CheckEnter;
import ss17_binary_file_serialization.exercise.exercise_one.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        while (true) {
            int enterNumber;
            while (true) {
                try {
                    System.out.println("Lựa chọn chức năng");
                    System.out.println("1.Hiển thị cửa hàng");
                    System.out.println("2.Thêm mới sản phẩm");
                    System.out.println("3.Xóa sản phẩm");
                    System.out.println("4.Tìm kiếm theo tên");
                    System.out.println("0.Thoát");
                    enterNumber = Integer.parseInt(scanner.nextLine());
                    if (enterNumber < 0) {
                        throw new CheckEnter("Chức năng không tồn tại xin mời nhập lại");
                    } else if (enterNumber > 4) {
                        throw new CheckEnter("Chức năng không tồn tại xin mời nhập lại");
                    } else {
                        break;
                    }
                } catch (CheckEnter c) {
                    c.getMessage();
                } catch (NumberFormatException n) {
                    System.out.println("Người dùng nhập không phải số vui lòng nhập lại");
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }
            switch (enterNumber) {
                case 1:
                    productService.displayAll();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.searchName();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã ghé thăm ! Chào thân ái ^^! và hẹn gặp lại");
                    System.exit(1);

            }
        }
    }
}
