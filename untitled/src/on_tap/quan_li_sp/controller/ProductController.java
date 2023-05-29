package on_tap.quan_li_sp.controller;

import on_tap.quan_li_sp.service.CheckInput;
import on_tap.quan_li_sp.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();

    public static void displayMenu() {
        int choseNumber = 0;
        while (true) {
            D:
            while (true) {
                try {
                    System.out.println("----------------------");
                    System.out.println("Lựa chọn chức năng");
                    System.out.println("1.Hiển thị thông tin sản phẩm");
                    System.out.println("2.Thêm mới sản phẩm");
                    System.out.println("3.Xóa sản phẩm");
                    System.out.println("4.Tìm sản phẩm theo tên");
                    System.out.println("5.Sắp xếp lại sản phẩm theo giá sản phẩm");
                    System.out.println("0.Thoát");
                    choseNumber = Integer.parseInt(scanner.nextLine());
                    if (choseNumber < 0) {
                        throw new CheckInput("Người dùng nhập sai định dạng");
                    } else if (choseNumber > 5) {
                        throw new CheckInput("Chức năng không tồn tại ");
                    }
                    break D;

                } catch (CheckInput c) {
                    c.getMessage();
                    System.out.println("Vui lòng nhập lại");
                }catch (NumberFormatException n){
                    System.out.println("Người dùng nhập vào không phải số");
                }catch (Exception e){
                    System.out.println("Error");
                }
            }

            switch (choseNumber) {
                case 1:
                    productService.getAll();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    productService.searchName();
                    break;
                case 5:
                    productService.sortList();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã ghé thăm cửa hàng");
                    System.out.println("Xin cảm ơn và hẹn gặp lại");
                    System.exit(1);


            }
        }
    }
}

