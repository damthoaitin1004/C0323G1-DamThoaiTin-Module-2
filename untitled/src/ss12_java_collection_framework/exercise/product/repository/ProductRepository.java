package ss12_java_collection_framework.exercise.product.repository;

import ss12_java_collection_framework.exercise.product.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {


    private static List<Product> products = new ArrayList<>();


    static {
        products.add(new Product("SP001", "Bánh sicula", 50000, 100));
        products.add(new Product("SP002", "Bánh dâu", 40000, 100));
        products.add(new Product("SP003", "Bánh hường cánh sen", 550000, 100));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void sortDescending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }

            }
        });
    }

    @Override
    public void sortedProduct() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }

            }


        });
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public List<Product> getSearchName(String name) {
         List<Product> newProduct = new ArrayList<>();

        for (Product p : products) {
            if (p.getNameProduct().toLowerCase().contains(name.toLowerCase())) {
                newProduct.add(p);
            }
        }
        if (newProduct.size() == 0) {
            return null;
        } else {
            return newProduct;
        }

    }

    @Override
    public Product getByCode(String code) {
        for (Product product : products) {
            if (product.getCodeProduct().equals(code)) {
                return product;
            }
        }
        return null;
    }
}
