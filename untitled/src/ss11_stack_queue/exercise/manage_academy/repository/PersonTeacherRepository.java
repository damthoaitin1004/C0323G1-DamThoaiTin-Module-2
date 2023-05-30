package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.repository.file_repository.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PersonTeacherRepository implements IPersonRepository {
    private static final String PATH_TEACHER = "E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\teacher.csv";

    private static List<Person> teacher = new ArrayList<>();
//
//    static {
//        student = ReadAndWriteFile.readStudentList("E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\student.csv");
//    }


    @Override
    public List<Person> getAll() {
        teacher.clear();
        teacher = ReadAndWriteFile.readTeacherList(PATH_TEACHER);
        return teacher;
    }

    @Override
    public void addPerson(Person person) {
        teacher = ReadAndWriteFile.readTeacherList(PATH_TEACHER);
        teacher.add(person);
        ReadAndWriteFile.writeStudentList(teacher,PATH_TEACHER);

    }


    @Override
    public Person getByCode(String code) {
        teacher = ReadAndWriteFile.readTeacherList(PATH_TEACHER);
        for (Person person : teacher) {
            if (person.getCodePerson().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        teacher = ReadAndWriteFile.readTeacherList(PATH_TEACHER);
        teacher.remove(person);
        ReadAndWriteFile.writeStudentList(teacher,PATH_TEACHER);
    }

}


