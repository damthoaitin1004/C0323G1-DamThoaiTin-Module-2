package on_tap.quan_li_sp.model;

import java.util.Objects;

public class Product {
    private String code;
    private String name;
    private int prince;
    private int quantity;

    public Product() {
    }

    public Product(String code, String name, int prince, int quantity) {
        this.code = code;
        this.name = name;
        this.prince = prince;
        this.quantity = quantity;
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

    public int getPrince() {
        return prince;
    }

    public void setPrince(int prince) {
        this.prince = prince;
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
        return getPrince() == product.getPrince() && getQuantity() == product.getQuantity() && getCode().equals(product.getCode()) && getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName(), getPrince(), getQuantity());
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", prince=" + prince +
                ", quantity=" + quantity +
                '}';
    }
    public String getInformation(){
        return this.code+","+this.name+","+this.prince+","+this.quantity;
    }
}
