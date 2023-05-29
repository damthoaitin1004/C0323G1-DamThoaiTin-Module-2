package ss17_binary_file_serialization.exercise.WriteFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteBinaryFile {
    private static final String CUSTOMER_LIST_PATH = "ss17_binary_file_serialization\\product.dat";

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product productA = new Product("SP01","Kẹo ăn là ghiền",15000,100,"China");
        Product productB = new Product("SP02","Kẹo siêu dẻo",35000,100,"Korea");
        Product productC = new Product("SP03","Bánh siêu ngon",25000,100,"VietNam");
        Product productD = new Product("SP04","Bánh siêu dẻo",25000,100,"Japan");
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);
        WriteProductFromFile(productList,"ss17_binary_file_serialization\\product.dat");
    }

    public static void WriteProductFromFile(List<Product> productList, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
