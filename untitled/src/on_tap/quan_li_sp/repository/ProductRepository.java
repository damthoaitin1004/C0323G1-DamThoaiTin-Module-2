package on_tap.quan_li_sp.repository;

import on_tap.quan_li_sp.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static void main(String[] args) {

    }

    private static List<Product> productList = new ArrayList<>();

    static {
        Product productA = new Product("SP001", "Bánh sidula", 30000, 200);
        Product productB = new Product("SP002", "Bánh Rán siêu béo", 23000, 200);
        Product productC = new Product("SP003", "Bánh sidula", 30000, 100);
        Product productD = new Product("SP004", "Bánh rán", 50000, 150);
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);
    }

    @Override
    public void remoteProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }


    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public Product getByCode(String code) {
        for (Product p : productList) {
            if (p.getCode().equals(code)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sortUp() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrince() < o2.getPrince()) {
                    return 1;
                } else if (o1.getPrince() == o2.getPrince()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void sortDown() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrince() > o2.getPrince()) {
                    return 1;
                } else if (o1.getPrince() == o2.getPrince()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public List<Product> searchName(String name) {
        List<Product> productSearch = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name)) {
                productSearch.add(p);
            }
        }
        if (productSearch.size() == 0) {
            return null;
        } else {
            return productSearch;
        }
    }
}
