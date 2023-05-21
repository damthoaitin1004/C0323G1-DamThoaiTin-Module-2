package ss11_stack_queue.exercise.manage_academy.controller;

import ss11_stack_queue.exercise.manage_academy.service.IPersonService;
import ss11_stack_queue.exercise.manage_academy.service.StudentService;
import ss11_stack_queue.exercise.manage_academy.service.TeacherService;

import java.util.Scanner;

public class PersonController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService studentService = new StudentService();
    private static IPersonService teacherService = new TeacherService();

    public static void menu() {
        do {
            System.out.println("---------------------------------------");
            System.out.println("Lựa chọn chức năng: ");
            System.out.println("1. Hiển thị ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Xóa ");
            System.out.println("0. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Xem thông tin học viên");
                    System.out.println("2.Xem thông tin giáo viên");
                    int checkPerson = Integer.parseInt(scanner.nextLine());
                    if (checkPerson == 1) {
                        studentService.displayAll();
                    } else {
                        teacherService.displayAll();
                    }
                    break;
                case 2:
                    System.out.println("1.Thêm mới học viên");
                    System.out.println("2.Thêm mới giáo viên");
                    int addPerson = Integer.parseInt(scanner.nextLine());
                    if (addPerson == 1) {
                        studentService.addPerson();
                        break;
                    } else {
                        teacherService.addPerson();
                        break;
                    }

                case 3:
                    System.out.println("1.đuổi học học viên");
                    System.out.println("2.sa thải giáo viên");
                    int delePerson = Integer.parseInt(scanner.nextLine());
                    if (delePerson == 1) {
                        studentService.deletePerson();
                    } else {
                        teacherService.deletePerson();
                    }

                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã ghé thăm ! Chào thân ái ^^!");
                    System.exit(1);
            }
        } while (true);
    }
}
