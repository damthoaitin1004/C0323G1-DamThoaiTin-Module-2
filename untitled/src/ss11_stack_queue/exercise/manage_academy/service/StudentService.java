package ss11_stack_queue.exercise.manage_academy.service;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;
import ss11_stack_queue.exercise.manage_academy.repository.IPersonRepository;
import ss11_stack_queue.exercise.manage_academy.repository.PersonStudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonRepository studentRepository = new PersonStudentRepository();
    boolean flag = true;


    @Override
    public void displayAll() {

        List<Person> student = studentRepository.getAll();
        for (Person p : student) {
            System.out.println(p);
        }
    }

    @Override
    public void addPerson() {
        System.out.print("Nhập mã học viên : ");
        String code = scanner.nextLine();
        Person checkCode;
        while (true) {
            checkCode = studentRepository.getByCode(code);
            if (checkCode == null) {
                break;
            } else {
                System.out.println("Mã học viên đã tồn tại vui lòng nhập mã khác");
                code = scanner.nextLine();
            }
        }

        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Chọn giới tính cho học viên: ");
        System.out.print("1.Nam ");
        System.out.print("2.Nữ ");
        int gender = Integer.parseInt(scanner.nextLine());
        if (gender == 2) {
            flag = false;
        }
        System.out.println("Nhập lớp cho học viên: ");
        String classes = scanner.nextLine();

        System.out.print("Nhập điểm cho học viên: ");
        int point = Integer.parseInt(scanner.nextLine());

        Person studentsNew = new Student(name, flag, code, point, classes);
        studentRepository.addPerson(studentsNew);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deletePerson() {
        System.out.print("Bạn muốn xóa học viên nào. Vui lòng nhập mã học viên: ");
        String code = scanner.nextLine();
        Person studentDele = studentRepository.getByCode(code);
        if (studentDele == null) {
            System.out.println("Không có sản phẩm");
        } else {
            System.out.println("Bạn có muốn xóa học viên với tên: " + studentDele.getName());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                studentRepository.removePerson(studentDele);
                System.out.println("Xóa thành công");
            }
        }

    }
}
