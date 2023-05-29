package on_tap.quan_li_sp.repository;

import on_tap.quan_li_sp.model.Product;

import java.util.List;

public interface IProductRepository {
    void remoteProduct(Product product);
    void addProduct(Product product);
    List<Product> getAll();
    Product getByCode(String code);
    List<Product> searchName(String name);
    void sortUp();
    void sortDown();
}
