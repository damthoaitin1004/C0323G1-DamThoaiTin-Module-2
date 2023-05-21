package ss11_stack_queue.exercise.manage_academy.model;

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
}
