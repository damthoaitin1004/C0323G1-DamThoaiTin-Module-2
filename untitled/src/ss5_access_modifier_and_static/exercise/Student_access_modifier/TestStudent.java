package ss5_access_modifier_and_static.exercise.Student_access_modifier;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student john = new Student();
        System.out.println("change information for John");
        System.out.println("change name information ");
        String newName = scanner.nextLine();
        john.setName(newName);
        System.out.println("change class information ");
        String newClasses = scanner.nextLine();
        john.setClasses(newClasses);
         System.out.println(john.toString());
    }
}
