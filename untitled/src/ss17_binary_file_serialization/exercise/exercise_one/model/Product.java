package ss17_binary_file_serialization.exercise.exercise_one.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String code;
    private String name;
    private float price;
    private int quantity;
    private String production;

    public Product(String newCode, String newName, float newPrice, int newQuantity) {

    }

    public Product(String code, String name, float price, int quantity, String production) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Float.compare(product.getPrice(), getPrice()) == 0 && getQuantity() == product.getQuantity() && getCode().equals(product.getCode()) && getName().equals(product.getName()) && getProduction().equals(product.getProduction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName(), getPrice(), getQuantity(), getProduction());
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", production='" + production + '\'' +
                '}';
    }
}
