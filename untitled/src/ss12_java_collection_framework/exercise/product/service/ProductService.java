package ss12_java_collection_framework.exercise.product.service;

import ss12_java_collection_framework.exercise.product.model.Product;
import ss12_java_collection_framework.exercise.product.repository.IProductRepository;
import ss12_java_collection_framework.exercise.product.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void displayAll() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void sortedList() {
        System.out.println("Bạn muốn sắp xếp: ");
        System.out.println("1.Sắp xếp theo tăng dần ");
        System.out.println("2.Sắp xếp theo giảm dần ");
        int chose = Integer.parseInt(scanner.nextLine());
        switch (chose) {
            case 1:
                productRepository.sortDescending();
                break;
            case 2:
                productRepository.sortedProduct();
                break;
        }
    }

    @Override
    public void setProduct() {


        System.out.println("Nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        Product checkProduct;

        checkProduct = productRepository.getByCode(code);
        if (checkProduct == null) {
            System.out.println("Mã sản phẩm không tồn tại");

        } else {

            REUSULF:      while (true) {
                System.out.println("Bạn muốn sửa thông tin nào của sản phẩm: " + checkProduct.getNameProduct());
                System.out.println("1.Tên sản phẩm: ");
                System.out.println("2.Giá tiền sản phẩm: ");
                System.out.println("2.Số lượng sản phẩm: ");
                System.out.println("0.Trở về : ");
                int chose = Integer.parseInt(scanner.nextLine());

                switch (chose) {
                    case 1:
                        System.out.println("Vui lòng nhập tên mới cho sản phẩm: ");
                        String newName = scanner.nextLine();
                        checkProduct.setNameProduct(newName);
                        System.out.println("Đã cập nhật thành công");
                        break;
                    case 2:
                        System.out.println("Vui lòng nhập giá tiền mới cho sản phẩm: ");
                        float newPrice = Float.parseFloat(scanner.nextLine());
                        checkProduct.setPrice(newPrice);
                        System.out.println("Đã cập nhật thành công");

                        break;
                    case 3:
                        System.out.println("Vui lòng nhập số lượng mới cho sản phẩm: ");
                        int newQuantity = Integer.parseInt(scanner.nextLine());
                        checkProduct.setQuantity(newQuantity);
                        System.out.println("Đã cập nhật thành công");
                        break;
                    case 0:
                        break REUSULF;

                }
            }
        }

    }


    @Override
    public void searchName() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        List<Product>
                checkName = productRepository.getSearchName(name);
        if (checkName == null) {
            System.out.println("Sản phẩm không có trong cửa hàng");

        } else {
            for (Product a : checkName) {
                System.out.println(a);
            }


        }
    }

    @Override
    public void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        Product checkCode;
        while (true) {
            checkCode = productRepository.getByCode(code);
            if (checkCode == null) {
                break;
            } else {
                System.out.println("Mã sản phẩm đã tồn tại vui lòng nhập mã khác");
                code = scanner.nextLine();
            }
        }
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Float price = Float.valueOf(scanner.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(code, name, price, quantity);
        productRepository.addProduct(product);
        System.out.println("Thêm mới thành công");

    }


    @Override
    public void deleteProduct() {
        System.out.print("Bạn muốn xóa sản phẩm nào. Vui lòng nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        Product productDele = productRepository.getByCode(code);
        if (productDele == null) {
            System.out.println("Không có sản phẩm");
        } else {
            System.out.println("Bạn có muốn xóa sản phẩm với tên: " + productDele.getNameProduct());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.removeProduct(productDele);
                System.out.println("Xóa thành công");
            }
        }
    }
}
