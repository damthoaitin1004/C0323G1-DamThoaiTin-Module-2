package ss10_data_structure_algorithms.exercise.array_list;

public class TestMyList {
    public static void main(String[] args) {
        MyList myList = new MyList<Integer>();
        myList.add(0, 5);
        myList.add(1, 4);
        myList.add(2, 8);
        myList.add(3, 4);
        myList.add(4, 4);
        myList.add(5, 4);
        myList.add(6, 4);
        myList.add(7, 9);
        myList.add(8, 4);
        myList.add(9, 10);
        myList.add(10, 4);
        myList.add(11, 4);
        myList.add(12, 12);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println(myList.get(4));
        System.out.println(myList.get(5));
        System.out.println(myList.get(6));
        System.out.println(myList.get(7));
        System.out.println(myList.get(8));
        System.out.println(myList.get(9));
        System.out.println(myList.get(10));
        System.out.println(myList.get(11));
        System.out.println(myList.get(12));
        System.out.println("Size of arrayList is: " + myList.size());

        myList.add(2, 14);
        System.out.println(myList.get(2));
        myList.remove(2);
        System.out.println(myList.get(2));
        System.out.println(myList.contains(4));
        System.out.println(myList.indexOf(5));

        myList.add(5);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Index " + i + " of myList is: " + myList.get(i));
        }
        myList.clear();
        System.out.println(myList.size());
    }
}
