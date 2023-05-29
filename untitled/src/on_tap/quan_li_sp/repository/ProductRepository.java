package on_tap.quan_li_sp.repository;

import on_tap.quan_li_sp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    public static void main(String[] args) {

    }
    private static List<Product> productList = new ArrayList<>();
    static {
        Product productA = new Product("SP001","B");
    }
}
