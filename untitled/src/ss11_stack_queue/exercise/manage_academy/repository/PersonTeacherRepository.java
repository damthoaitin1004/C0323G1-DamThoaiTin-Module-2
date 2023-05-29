package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Teacher;
import ss11_stack_queue.exercise.manage_academy.repository.file_repository.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PersonTeacherRepository implements IPersonRepository{
    public static void main(String[] args) {

    }
    private static List<Person> teacher = new ArrayList<>();
    static {
        teacher=ReadAndWriteFile.readTeacherList("ss11_stack_queue/exercise/manage_academy/repository/file_repository/teacher.csv");
        teacher.add(new Teacher("Hai BĐ",true,"0555","Thực hành"));
        teacher.add(new Teacher("Sơn Tùng ATM",false,"0245","Tấu hài"));
        ReadAndWriteFile.writeStudentList(teacher,"ss11_stack_queue/exercise/manage_academy/repository/file_repository/teacher.csv");

    }

    @Override
    public List<Person> getAll() {
        return teacher;
    }

    @Override
    public void addPerson(Person person) {

        teacher = ReadAndWriteFile.readTeacherList("ss11_stack_queue/exercise/manage_academy/repository/file_repository/teacher.csv");
        teacher.add(person);
        ReadAndWriteFile.writeStudentList(teacher, "ss11_stack_queue/exercise/manage_academy/repository/file_repository/teacher.csv");
    }

    @Override
    public Person getByCode(String code) {
        for(Person person: teacher) {
            if(person.getCodePerson().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {

        teacher = ReadAndWriteFile.readTeacherList("ss11_stack_queue/exercise/manage_academy/repository/file_repository/teacher.csv");
        teacher.remove(person);
        ReadAndWriteFile.writeStudentList(teacher, "ss11_stack_queue/exercise/manage_academy/repository/file_repository/teacher.csv");
    }

}
