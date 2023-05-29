package ss11_stack_queue.exercise.manage_academy.model.academy;

import ss11_stack_queue.exercise.manage_academy.model.Person;

import java.util.Objects;

public class Teacher extends Person {
private String capacity;

    public Teacher() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return getCapacity() == teacher.getCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacity());
    }

    public Teacher(String name, boolean gender, String codePerson, String capacity) {
        super(name, gender, codePerson);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return   super.toString()+
                "capacity=" + capacity +
                '}';
    }
    public String getInformation() {
        return super.getInformation()+","+this.capacity;
    }
}
