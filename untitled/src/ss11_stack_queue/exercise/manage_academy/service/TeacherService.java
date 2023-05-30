package ss11_stack_queue.exercise.manage_academy.service;

import ss11_stack_queue.exercise.manage_academy.controller.InputException;
import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Teacher;
import ss11_stack_queue.exercise.manage_academy.repository.IPersonRepository;
import ss11_stack_queue.exercise.manage_academy.repository.PersonTeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonRepository teacherRepository = new PersonTeacherRepository();
    boolean flag = false;

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
        while (true){
            try {
                System.out.print("Chọn giới tính cho giáo viên: ");
                System.out.print("1.Nam ");
                System.out.print("2.Nữ ");
                int gender = Integer.parseInt(scanner.nextLine());
                if (gender == 2) {
                    flag = true;
                    break;
                } else if (gender == 1) {
                    break;
                } else {
                    throw new InputException("Sai chức năng vui lòng nhập lại");
                }
            } catch (InputException i) {
                i.getMessage();
            } catch (NumberFormatException catchNum) {
                System.out.println("Nhập sai vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        System.out.print("Chuyên môn của giáo viên là: ");
        String capacity = scanner.nextLine();

        Person newTeacher = new Teacher(name,flag,codeNew,capacity);
        teacherRepository.addPerson(newTeacher);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deletePerson() {
        System.out.print("Bạn muốn xóa giáo viên nào. Vui lòng nhập mã giáo viên: ");
        String code = scanner.nextLine();
        Person teacherDele = teacherRepository.getByCode(code);
        if (teacherDele == null) {
            System.out.println("Không có giáo viên");
        } else {
            while (true){
                try {
                    System.out.println("Bạn có muốn xóa giáo viên với tên: " + teacherDele.getName());
                    System.out.println("1. Xóa");
                    System.out.println("2. Suy nghĩ lại");
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1) {
                        teacherRepository.removePerson(teacherDele);
                        System.out.println("Xóa thành công");
                    }
                    break;
                } catch (NumberFormatException choseFalse){
                    System.out.println("Nhập sai rồi xin mời nhập lại");
                }
          }
        }
    }
}
