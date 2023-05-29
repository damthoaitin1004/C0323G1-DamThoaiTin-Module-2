package ss17_binary_file_serialization.exercise.exercise_one.repository;

import ss17_binary_file_serialization.exercise.exercise_one.model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getAll();
    Product getByCode(String code);
    List<Product> searchName(String name);
}
