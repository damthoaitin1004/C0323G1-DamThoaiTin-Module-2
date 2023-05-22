package ss12_java_collection_framework.exercise.product.repository;

import ss12_java_collection_framework.exercise.product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void addProduct(Product product);
    void removeProduct(Product product);
    Product getByCode(String code);
    List<Product> getSearchName(String name);
    void sortedProduct();
    void sortDescending();


}
