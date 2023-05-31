package ss11_stack_queue.exercise.manage_academy.model;

import java.util.Objects;

public class Person {
    private String name;
    private boolean gender;
    private String codePerson;
    public Person(){}

    public Person(String name, boolean gender, String codePerson) {
        this.name = name;

        this.gender = gender;
        this.codePerson = codePerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getCodePerson().equals(person.getCodePerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodePerson());
    }

    public String getCodePerson() {
        return codePerson;
    }

    public void setCodePerson(String codePerson) {
        this.codePerson = codePerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", codePerson='" + codePerson + '\''
                ;
    }
    public String getInformation() {
      return this.name+","+this.gender+","+this.codePerson;
    }

}
