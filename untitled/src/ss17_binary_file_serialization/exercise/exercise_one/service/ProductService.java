package ss17_binary_file_serialization.exercise.exercise_one.service;

import ss17_binary_file_serialization.exercise.exercise_one.exception.CheckEnter;
import ss17_binary_file_serialization.exercise.exercise_one.model.Product;
import ss17_binary_file_serialization.exercise.exercise_one.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void displayAll() {
        List<Product> products = productRepository.getAll();
        if (products.size()==0){
            System.out.println("Chưa có sản phẩm nào trong cửa hàng");
        }else {
            for (Product p : products) {
                System.out.println(p);
            }
        }

    }

    @Override
    public void deleteProduct() {
        System.out.println("Vui lòng nhập mã sản phẩm ");
        String checkCode = scanner.nextLine();
        Product productDele = productRepository.getByCode(checkCode);
        if (productDele == null) {
            System.out.println("Sản phẩm bạn muốn xóa không có trong kho hàng");
        } else {
            while (true) {
                try {
                    System.out.println("Có muốn xóa sản phẩm " + productDele.getName() + " này không ");
                    System.out.println("1.Xóa");
                    System.out.println("2.Suy nghĩ lại");
                    int choseNumber = Integer.parseInt(scanner.nextLine());
                    if (choseNumber == 1) {
                        productRepository.removeProduct(productDele);
                        break;
                    } else if (choseNumber == 2) {
                        break;
                    } else {
                        throw new CheckEnter("Nhập sai chức năng vui lòng nhập lại");
                    }
                } catch (CheckEnter e) {
                    e.getMessage();
                    System.out.println("Vui lòng nhập lại");
                } catch (NumberFormatException n) {
                    System.out.println("Người dùng nhập không phải là số vui lòng nhập lại");
                } catch (Exception o) {
                    System.out.println("Error");
                }

            }
        }
    }

    @Override
    public void add() {
        String newCode;
        while (true) {
            System.out.println("Nhập mã sản phẩm bạn muốn thêm mới ");
             newCode = scanner.nextLine();
            Product checkProduct = productRepository.getByCode(newCode);
            if (checkProduct != null) {
                System.out.println("Mã sản phẩm đã tồn tại vui lòng nhập lại mã khác");
            } else {
                break;
            }
        }
        System.out.println("Vui lòng nhập tên sản phẩm thêm mới của bạn");
        String newName = scanner.nextLine();
        float newPrice=0;
        while (true) {
            try {
                System.out.println("Nhập giá cho sản phẩm thêm mới ");
                 newPrice = Float.parseFloat(scanner.nextLine());
                if (newPrice < 0) {
                    throw new CheckEnter("Giá tiền phải lớn hơn 0 vui lòng nhập lại");
                }
                break;
            } catch (CheckEnter c) {
                c.getMessage();
            } catch (NumberFormatException n) {
                System.out.println("Người dùng nhập không phải số vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        int newQuantity=0;
        while (true){
            try {
                System.out.println("Nhập số lượng cho sản phẩm");
                 newQuantity = Integer.parseInt(scanner.nextLine());
                if (newQuantity < 0){
                    throw new CheckEnter("Giá sản phẩm phải lớn hơn 0 vui lòng nhập lại");
                }
                break;
            }catch (CheckEnter c){
                c.getMessage();
            }catch (NumberFormatException n){
                System.out.println("Người dùng nhập không phải số vui lòng nhập lại");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
           System.out.println("Nhập hãng sản xuất cho sản phẩm");
        String newProduction = scanner.nextLine();
        Product newProduct = new Product(newCode,newName,newPrice,newQuantity,newProduction);
        productRepository.addProduct(newProduct);
    }

    @Override
    public void searchName() {
        System.out.println("Nhập tên hoặc kí tự bạn muốn tìm kiếm trong cửa hàng");
        String nameSearch = scanner.nextLine();
          List<Product> arrSearch= productRepository.searchName(nameSearch);
        if (arrSearch == null){
            System.out.println("Kết quả tìm kiếm không có");
        }else {
            for (Product p:arrSearch) {
                System.out.println(p);
            }
        }
    }
}
