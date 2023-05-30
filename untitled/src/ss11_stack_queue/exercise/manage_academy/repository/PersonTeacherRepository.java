package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.common.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PersonTeacherRepository implements IPersonRepository {


    private static List<Person> teacher = new ArrayList<>();



    @Override
    public List<Person> getAll() {
        teacher.clear();
        teacher = ReadAndWriteFile.readTeacherList("ss11_stack_queue/exercise/manage_academy/file_repository/teacher.csv");
        return teacher;
    }

    @Override
    public void addPerson(Person person) {
        teacher = getAll();
        teacher.add(person);
        ReadAndWriteFile.writeStudentList(teacher, "ss11_stack_queue/exercise/manage_academy/file_repository/teacher.csv");
    }


    @Override
    public Person getByCode(String code) {
        teacher = getAll();
        for (Person person : teacher) {
            if (person.getCodePerson().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        teacher =getAll();
        teacher.remove(person);
        ReadAndWriteFile.writeStudentList(teacher, "ss11_stack_queue/exercise/manage_academy/file_repository/teacher.csv");
    }

}


