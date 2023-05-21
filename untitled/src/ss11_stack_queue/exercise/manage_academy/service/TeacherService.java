package ss11_stack_queue.exercise.manage_academy.service;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;
import ss11_stack_queue.exercise.manage_academy.model.academy.Teacher;
import ss11_stack_queue.exercise.manage_academy.repository.IPersonRepository;
import ss11_stack_queue.exercise.manage_academy.repository.PersonTeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonRepository teacherRepository = new PersonTeacherRepository();
    boolean flag = true;

    @Override
    public void displayAll() {
        List<Person> teacher = teacherRepository.getAll();
        for (Person p : teacher) {
            System.out.println(p);
        }
    }

    @Override
    public void addPerson() {
        System.out.print("Nhập mã giáo viên: ");
        String codeNew = scanner.nextLine();
        Person checkCode;
        while (true) {
            checkCode = teacherRepository.getByCode(codeNew);
            if (checkCode == null) {
                break;
            } else {
                System.out.println("Mã học viên đã tồn tại vui lòng nhập mã khác");
                codeNew = scanner.nextLine();
            }}
        System.out.print("Nhập tên giáo viên: ");
        String name = scanner.nextLine();
        System.out.print("Chọn giới tính cho giáo viên: ");
        System.out.print("1.Nam ");
        System.out.print("2.Nữ ");
        int gender = Integer.parseInt(scanner.nextLine());
        if (gender == 2) {
            flag = false;
        }
        System.out.print("Chuyên môn của giáo viên là: ");
        String capacity = scanner.nextLine();

        Person newTeacher = new Teacher(name,flag,codeNew,capacity);
        teacherRepository.addPerson(newTeacher);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deletePerson() {
        System.out.print("Bạn muốn xóa học viên nào. Vui lòng nhập mã học viên: ");
        String code = scanner.nextLine();
        Person teacherDele = teacherRepository.getByCode(code);
        if (teacherDele == null) {
            System.out.println("Không có sản phẩm");
        } else {
            System.out.println("Bạn có muốn xóa học viên với tên: " + teacherDele.getName());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                teacherRepository.removePerson(teacherDele);
                System.out.println("Xóa thành công");
            }
        }
    }
}