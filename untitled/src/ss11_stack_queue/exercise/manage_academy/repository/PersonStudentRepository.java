package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;
import ss11_stack_queue.exercise.manage_academy.repository.file_repository.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PersonStudentRepository implements IPersonRepository {
    public static void main(String[] args) {


    }

    private static List<Person> student = new ArrayList<>();
//
//    static {
//        student = ReadAndWriteFile.readStudentList("E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");
//    }


    @Override
    public List<Person> getAll() {
        student = ReadAndWriteFile.readStudentList("E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");
        return student;
    }

    @Override
    public void addPerson(Person person) {
         student = ReadAndWriteFile.readStudentList("E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");
         student.add(person);
        ReadAndWriteFile.writeStudentList(student, "E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");

    }


    @Override
    public Person getByCode(String code) {
        student = ReadAndWriteFile.readStudentList("E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");
        for (Person person : student) {
            if (person.getCodePerson().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        student = ReadAndWriteFile.readStudentList("E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");
        student.remove(person);
        ReadAndWriteFile.writeStudentList(student, "E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");
    }


    }



