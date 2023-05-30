package ss17_binary_file_serialization.exercise.exercise_one.repository;

import ss17_binary_file_serialization.exercise.exercise_one.common.WriteFile;
import ss17_binary_file_serialization.exercise.exercise_one.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
//    private static final String CUSTOMER_LIST_PATH = "src\\ss17_binary_file_serialization\\exercise_one\\write_file\\product.dat";

    public static void main(String[] args) {

    }

    private static List<Product> productList = new ArrayList<>();

//    static {
////        productList = WriteFile.ReadProductFromFile("ss17_binary_file_serialization\\product.dat");
//        Product productA = new Product("SP01", "Kẹo ăn là ghiền", 15000, 100, "China");
//        Product productB = new Product("SP02", "Kẹo siêu dẻo", 35000, 100, "Korea");
//        Product productC = new Product("SP03", "Bánh siêu ngon", 25000, 100, "VietNam");
//        Product productD = new Product("SP04", "Bánh siêu dẻo", 25000, 100, "Japan");
//        productList.add(productA);
//        productList.add(productB);
//        productList.add(productC);
//        productList.add(productD);
//        WriteFile.WriteProductFromFile(productList, "ss17_binary_file_serialization/exercise/exercise_one/write_file/product.dat");
//    }

    @Override
    public void addProduct(Product product) {
        productList = getAll();
        productList.add(product);
        WriteFile.WriteProductFromFile(productList, "ss17_binary_file_serialization/exercise/exercise_one/data/product.dat");
    }

    @Override
    public void removeProduct(Product product) {
        productList = getAll();
        productList.remove(product);
        WriteFile.WriteProductFromFile(productList, "ss17_binary_file_serialization/exercise/exercise_one/data/product.dat");
    }

    @Override
    public List<Product> getAll() {
        productList.clear();
        productList = WriteFile.ReadProductFromFile("ss17_binary_file_serialization/exercise/exercise_one/data/product.dat");
        return productList;
    }

    @Override
    public List<Product> searchName(String name) {
        productList = getAll();
        List<Product> searchingName = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name)) {
                searchingName.add(p);
            }
        }
        if (searchingName.size() == 0) {
            return null;
        } else {
            return searchingName;
        }
    }

    @Override
    public Product getByCode(String code) {
        productList = getAll();
        for (Product p : productList) {
            if (p.getCode().equals(code)) {
                return p;
            }
        }
        return null;
    }


}
