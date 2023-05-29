package ss11_stack_queue.exercise.manage_academy.repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;

import java.util.List;

public interface IPersonRepository {
     List<Person> getAll();
    void addPerson(Person person);

    Person getByCode(String code);
    void removePerson(Person person);



}
