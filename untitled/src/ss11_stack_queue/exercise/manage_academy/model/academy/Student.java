package ss11_stack_queue.exercise.manage_academy.model.academy;

import ss11_stack_queue.exercise.manage_academy.model.Person;

import java.util.Objects;

public class Student extends Person {
   private int point;
   private String classes;
   public Student(String s, String s1, boolean s2, int point, String classes){

   }

    public Student(String name, boolean gender, String codePerson, int point, String classes) {
        super(name, gender, codePerson);
        this.point = point;
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getPoint() == student.getPoint() && getClasses().equals(student.getClasses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint(), getClasses());
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "point=" + point +
                ", classes='" + classes + '\'' +
                '}';
    }

    public String getInformation() {
       return super.getInformation()+","+this.point+","+this.classes;
    }
}
