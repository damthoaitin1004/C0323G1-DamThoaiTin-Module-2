package ss15_exception_debug.exercise;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Chương trình kiểm tra 3 cạnh của 1 tam giác-----");
        while (true) {
            float enterNumberA = 0;
            do {
                System.out.println("Nhập canh a của tam giác ");
                try {
                    enterNumberA = Float.parseFloat(scanner.nextLine());
                    if (enterNumberA<0){
                        throw new TriangleException("Sai định dạng");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("người dùng nhập ko phải là số");
                } catch (TriangleException e){
                    System.out.println(e.getMessage());
                    System.out.println("a phải là 1 số lớn hơn 0");
                } catch (Exception e) {
                    System.out.println("Error");
                }
            } while (true);
            float enterNumberB=0;
            do {
                System.out.println("Nhập canh b của tam giác ");
                try {
                    enterNumberB = Float.parseFloat(scanner.nextLine());
                    if (enterNumberB<0){
                        throw new TriangleException("Nhập sai định dạng");
                    }
                    break;
                } catch (NumberFormatException o){
                    System.out.println("Người dùng nhập không phải là số");
                }catch (TriangleException o){
                    System.out.println(o.getMessage());
                    System.out.println("b phải là 1 số lớn hơn 0");
                }
                catch (Exception i){
                    System.out.println("Eror");
                }

            }while (true);
            float enterNumberC=0;
             do {
                 System.out.println("Nhập canh c cuủa tam giác ");
                 try {
                     enterNumberC = Float.parseFloat(scanner.nextLine());
                     if (enterNumberC<0){
                         throw new TriangleException("Sai định dạng");
                     }
                     break;
                 } catch (NumberFormatException u){
                     System.out.println("Người dùng nhập không phải số");
                 }catch (TriangleException p){
                     System.out.println(p.getMessage());
                     System.out.println("c phải là 1 số lớn hơn 0");
                 }
                 catch (Exception p){
                     System.out.println("Eror");
                 }

             }while (true);

            try {
                checkTriangle(enterNumberA, enterNumberB, enterNumberC);
                System.out.println("Đây là 1  tam giác");
                break;
            } catch (TriangleException triangleException) {
                System.out.println(triangleException.getMessage());
                System.out.println("Vui lòng nhập lại");
            }

        }
    }

    public static boolean checkTriangle(float a, float b, float c) throws TriangleException {
        if (  a > b + c || b > a + c || c > a + b) {
            throw new TriangleException("Các cạnh tam giác không hợp lệ");
        }
        return true;
    }

}
