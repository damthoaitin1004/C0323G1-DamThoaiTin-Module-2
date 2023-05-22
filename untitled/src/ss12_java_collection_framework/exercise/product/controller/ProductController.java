package ss12_java_collection_framework.exercise.product.controller;

import ss12_java_collection_framework.exercise.product.service.IProductService;
import ss12_java_collection_framework.exercise.product.service.ProductService;

import java.util.Scanner;

public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    static IProductService productService = new ProductService();

    public static void menu() {
        do {
            System.out.println("---------------------------------------");
            System.out.println("Lựa chọn chức năng: ");
            System.out.println("1. Hiển thị kho hàng ");
            System.out.println("2. Thêm mới sản phẩm ");
            System.out.println("3. Xóa ");
            System.out.println("4. Tìm kiếm sản phẩm ");
            System.out.println("5. Cập nhật sản phẩm ");
            System.out.println("6. Sắp xếp sản phẩm ");
            System.out.println("0. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Xem thông tin sản phẩm");
                    productService.displayAll();
                    break;
                case 2:
                    System.out.println("2.Thêm mới sản phẩm");
                    productService.addProduct();
                    break;

                case 3:
                    System.out.println("3.xóa sản phẩm ");
                    productService.deleteProduct();
                    break;
                case 4:
                    System.out.println("4.Tìm kiếm sản phẩm ");
                    productService.searchName();
                    break;
                case 5:
                    System.out.println("5.Sửa thông tin sản phẩm ");
                    productService.setProduct();
                    break;
                case 6:
                    System.out.println("6.Sắp xếp sản phẩm theo giá ");
                    productService.sortedList();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã ghé thăm ! Chào thân ái ^^! và hẹn gặp lại");
                    System.exit(1);
            }
        } while (true);
    }
}

