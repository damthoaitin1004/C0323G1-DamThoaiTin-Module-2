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
            int choice=0;
            do {
                try {
                    System.out.println("---------------------------------------");
                    System.out.println("Lựa chọn chức năng: ");
                    System.out.println("1. Hiển thị ");
                    System.out.println("2. Thêm mới ");
                    System.out.println("3. Xóa ");
                    System.out.println("0. Thoát");
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 3) {
                        throw new InputException("Chức năng không tồn tại");
                    } else if (choice < 0) {
                        throw new InputException("Chức năng không tồn tại");
                    }
                    break;
                } catch (NumberFormatException q) {
                    System.out.println("Người dùng nhập không phải là số ");
                } catch (InputException u) {
                    System.out.println(u.getMessage());
                    System.out.println("Nhập sai chức năng xin mời nhập lại");
                }

            }while (true);

            switch (choice) {
                case 1: {
                    while (true) {
                        try {
                            System.out.println("1.Xem thông tin học viên");
                            System.out.println("2.Xem thông tin giáo viên");
                            System.out.println("0.Thoát");
                            int checkPerson = Integer.parseInt(scanner.nextLine());
                            if (checkPerson == 1) {
                                studentService.displayAll();
                                break;
                            } else if (checkPerson == 2) {
                                teacherService.displayAll();
                                break;
                            } else if (checkPerson == 0) {
                                break;
                            } else {
                                throw new InputException("Sai chức năng");
                            }
                        } catch (NumberFormatException p) {
                            System.out.println("sai định dạng mời nhập lại");
                        } catch (InputException exception) {
                            System.out.println(exception.getMessage());
                            System.out.println("Chức năng không tồn tại vui lòng nhập lại");
                        }
                    }
                }
                break;
                case 2: {
                    while (true) {
                        try {
                            System.out.println("1.Thêm mới học viên");
                            System.out.println("2.Thêm mới giáo viên");
                            System.out.println("0.Thoát");
                            int addPerson = Integer.parseInt(scanner.nextLine());
                            if (addPerson == 1) {
                                studentService.addPerson();
                                break;
                            } else if (addPerson == 2) {
                                teacherService.addPerson();
                                break;
                            } else if (addPerson == 0) {
                                break;
                            } else {
                                throw new InputException("Sai chức năng");
                            }
                        } catch (InputException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Chức năng không tồn tại xin mời nhập lại");
                        } catch (NumberFormatException n) {
                            System.out.println("Nhập sai định dạng xin mời nhập lại");
                        }
                    }
                }
                break;

                case 3: {
                    while (true) {
                        try {


                            System.out.println("1.đuổi học học viên");
                            System.out.println("2.sa thải giáo viên");
                            System.out.println("0.Hạ hỏa thoát ra và suy nghĩ lại");
                            int delePerson = Integer.parseInt(scanner.nextLine());
                            if (delePerson == 1) {
                                studentService.deletePerson();
                                break;
                            } else if (delePerson == 2) {
                                teacherService.deletePerson();
                                break;
                            } else if (delePerson == 0) {
                                break;
                            } else {
                                throw new InputException("Nhập sai chức năng ");
                            }
                        } catch (InputException i) {
                            System.out.println(i.getMessage());
                            System.out.println("Chức năng không tồn tại vui lòng nhập lại");
                        }catch (NumberFormatException m){
                            System.out.println("Người dùng nhập sai định dạng xin mời nhập lại");
                        }catch (Exception e){
                            System.out.println("Error");
                        }
                    }
                }
                break;
                case 0:
                    System.out.println("Cảm ơn bạn đã ghé thăm ! Chào thân ái ^^!");
                    System.exit(1);
            }
        } while (true);
    }
}
