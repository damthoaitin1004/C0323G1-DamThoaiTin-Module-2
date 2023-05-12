package ss5_access_modifier_and_static.exercise.Student_access_modifier;

public class Student {
    private String name = "John";
    private String classes = "C0323G1";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString(){
        return "Join {" +" name is "+name+
                ", area= " + classes +
                '}';
    }
}
