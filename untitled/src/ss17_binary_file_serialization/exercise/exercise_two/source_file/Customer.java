package ss17_binary_file_serialization.exercise.exercise_two.source_file;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private String code;
    private String name;
    private int age;
    public Customer(){

    }

    public Customer(String code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getAge() == customer.getAge() && getCode().equals(customer.getCode()) && getName().equals(customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
