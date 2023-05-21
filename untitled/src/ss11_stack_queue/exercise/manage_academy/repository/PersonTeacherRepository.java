package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;
import ss11_stack_queue.exercise.manage_academy.model.academy.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonTeacherRepository implements IPersonRepository{
    private static List<Person> teacher = new ArrayList<>();
    static {
        teacher.add(new Teacher("Hai BĐ",true,"0555","Thực hành"));
        teacher.add(new Teacher("Sơn Tùng ATM",false,"0245","Tấu hài"));

    }

    @Override
    public List<Person> getAll() {
        return teacher;
    }

    @Override
    public void addPerson(Person person) {
       teacher.add(person);
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
           teacher.remove(person);
    }
}
