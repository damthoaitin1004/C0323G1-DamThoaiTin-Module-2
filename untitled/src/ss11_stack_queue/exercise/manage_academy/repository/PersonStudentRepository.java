package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.common.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PersonStudentRepository implements IPersonRepository {
    public static void main(String[] args) {


    }

    private static List<Person> student = new ArrayList<>();


    @Override
    public List<Person> getAll() {
        student.clear();
        student = ReadAndWriteFile.readStudentList("ss11_stack_queue/exercise/manage_academy/file_repository/student.csv");
        return student;
    }

    @Override
    public void addPerson(Person person) {
         student = getAll();
         student.add(person);
        ReadAndWriteFile.writeStudentList(student,"ss11_stack_queue/exercise/manage_academy/file_repository/student.csv");

    }


    @Override
    public Person getByCode(String code) {
        student = getAll();
        for (Person person : student) {
            if (person.getCodePerson().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        student = getAll();
        student.remove(person);
        ReadAndWriteFile.writeStudentList(student,"ss11_stack_queue/exercise/manage_academy/file_repository/student.csv");
    }


    }



