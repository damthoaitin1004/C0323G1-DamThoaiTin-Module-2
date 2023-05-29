package on_tap.quan_li_sp.service;

import on_tap.quan_li_sp.model.Product;
import on_tap.quan_li_sp.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {

    private ProductRepository productRepository = new ProductRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getAll() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void sortList() {
        while (true) {
            try {
                System.out.println("Bạn muốn sắp xếp theo thứ tự nào");
                System.out.println("1.Tăng dần theo giá sản phẩm");
                System.out.println("2.Giảm dần theo giá sản phẩm");
                System.out.println("0.Quay lại");
                int enterChose = Integer.parseInt(scanner.nextLine());
                if (enterChose == 1) {
                    productRepository.sortUp();
                    break;
                } else if (enterChose == 2) {
                    productRepository.sortDown();
                    break;
                } else if (enterChose == 0) {
                    break;
                } else {
                    throw new CheckInput("Nhập sai chức năng ");
                }
            } catch (CheckInput c) {
                c.getMessage();
                System.out.println("Vui lòng nhập lại");
            } catch (NumberFormatException n) {
                System.out.println("Người dùng nhập không phải số vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println("Error");
            }

        }
    }

    @Override
    public void delete() {

        System.out.println("Vui lòng nhập mã sản phẩm bạn muốn xóa");
        String enterCode = scanner.nextLine();
        Product productDelete = productRepository.getByCode(enterCode);
        if (productDelete == null) {
            System.out.println("Mã sản phẩm không tồn tại");
        } else {
            while (true) {
                try {
                    System.out.println("Bạn có muốn xóa sản phẩm không");
                    System.out.println("1.Xóa");
                    System.out.println("2.Suy nghĩ lại");
                    int numberChose = Integer.parseInt(scanner.nextLine());
                    if (numberChose == 1) {
                        productRepository.remoteProduct(productDelete);
                        System.out.println("Xóa thành công");
                        break;
                    } else if (numberChose == 2) {
                        break;
                    } else {
                        throw new CheckInput("Nhập sai chức năng vui lòng nhập lại");
                    }
                } catch (CheckInput c) {
                    c.getMessage();
                } catch (NumberFormatException e) {
                    System.out.println("Người dùng nhập không phải là số vui lòng nhập lại");
                } catch (Exception o) {
                    System.out.println("Error");
                }
            }
        }

    }


    @Override
    public void searchName() {
        System.out.println("Vui lòng nhập tên sản phẩm bạn muốn tìm kiếm");
        String nameProduct = scanner.nextLine();
        List productSearch = productRepository.searchName(nameProduct);
        if (productSearch == null) {
            System.out.println("Không có sản phẩm bạn tìm trong cửa hàng");
        } else {
            for (Object p : productSearch) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void add() {
        String newCode;
        while (true) {
            System.out.println("Vui lòng nhập mã sản phẩm ");
            newCode = scanner.nextLine();
            if (productRepository.getByCode(newCode) == null) {
                System.out.println("Mã sản phẩm chưa tồn tại có thể khởi tạo sản phẩm");
                break;
            } else {
                System.out.println("Mã sản phẩm đã tồn tại vui lòng nhập lại");
            }
        }
        System.out.println("Vui lòng nhập tên sản phẩm");
        String newName = scanner.nextLine();
        int newPrice;
        while (true) {
            try {
                System.out.println("Vui lòng nhập giá cho sản phẩm");
                newPrice = Integer.parseInt(scanner.nextLine());
                if (newPrice < 0) {
                    throw new CheckInput("Sai định dạng vui lòng nhập lại");
                }
                break;
            } catch (CheckInput c) {
                c.getMessage();
            } catch (NumberFormatException n) {
                System.out.println("Người dùng nhập không phải số vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        int newQuantity;
        while (true) {
            try {
                System.out.println("Vui lòng nhập số lượng sản phẩm");
                newQuantity = Integer.parseInt(scanner.nextLine());
                if (newQuantity < 0) {
                    throw new CheckInput("Người dụng nhập sai số lượng");
                }
                break;
            } catch (CheckInput g) {
                System.out.println("Vui lòng nhập lại số lượng");
            } catch (NumberFormatException n) {
                System.out.println("Người dùng nhập không phải số vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        Product newProduct = new Product(newCode, newName, newPrice, newQuantity);
        productRepository.addProduct(newProduct);
        System.out.println("Nhập hàng thành công");
    }

}

