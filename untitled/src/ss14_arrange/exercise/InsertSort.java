package ss14_arrange.exercise;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = {3,2,4,3,8,5,1,0};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
    }

    /**
     *Chương trình minh họa lại thuật toán sắp xếp chèn
     *
     */
    public static void insertionSort(int[] arr) {
        int pos;        // vị trí của phần tử đem đi so sánh
        int x;          // phần tử được đem đi so sánh
        for (int i = 1; i < arr.length; i++) {
            x = arr[i]; //lấy phần tử thứ i ở trong mảng ra đem đi so sánh
            pos = i;    // gắn vị trí index của phan tu đem đi cho so sánh
            System.out.println("Lấy phần tử arr["+i+"] đem đi so sánh ");
            if (x >= arr[pos-1]){
                System.out.println("arr["+pos+"] lớn hơn các phần tử sau ");
                System.out.println("Giữ nguyên vị trị");
            }
            while (pos > 0 && x < arr[pos - 1]) {
                System.out.println("Vì arr["+pos+"] bé hơn phần tử sau là arr["+(pos-1)+"]");
                arr[pos] = arr[pos - 1];// đổi chỗ (trái qua phải)

                System.out.println("Đổi chỗ "+"arr["+pos+"] với "+"arr["+(pos - 1)+"]");
                pos--;
            }
            arr[pos] = x; //chen x vào
            System.out.println("Mảng sau khi được đổi chỗ");
            System.out.println(Arrays.toString(arr));
        }






    }
}
