package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;

import java.util.ArrayList;
import java.util.List;

public class PersonStudentRepository implements IPersonRepository{
    private static List<Person> student = new ArrayList<>();
    static {
       student.add(new Student("Dam Thoai Tin",true,"0325",9,"0323g1"));
       student.add(new Student("Dam Vinh Hung",false,"03265",9,"0323g1"));

    }

    @Override
    public List<Person> getAll() {
        return student;
    }

    @Override
    public void addPerson(Person person) {
        student.add(person);
    }


    @Override
    public Person getByCode(String code) {
        for(Person person: student) {
            if(person.getCodePerson().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
         student.remove(person);
    }
}
