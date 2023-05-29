package ss17_binary_file_serialization.exercise.exercise_two.source_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customerA=new Customer("001","Đặng Hải QUang",23);
        Customer customerB=new Customer("002","Nguyễn Văn Hai",23);
        Customer customerC=new Customer("001","Trương Văn Luyến",23);
        customerList.add(customerA);
        customerList.add(customerB);
        customerList.add(customerC);
        WriteCustomerFromFile(customerList, "ss17_binary_file_serialization/exercise/file/customer.dat");
    }

        public static void WriteCustomerFromFile(List<Customer> customer,String path) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(customer);
                objectOutputStream.flush();
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    public static List<Customer> ReadCustomerFromFile(String path) {
        List<Customer> customerList = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customerList = (List<Customer>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return customerList;
    }

}
