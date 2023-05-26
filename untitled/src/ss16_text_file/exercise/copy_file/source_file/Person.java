package ss16_text_file.exercise.copy_file.source_file;

public class Person {
    private int id;
    private String name;
    private int ages;
    public Person(int id, String name, String s){

    }

    public Person(int id, String name, int ages) {
        this.id = id;
        this.name = name;
        this.ages = ages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ages=" + ages +
                '}';
    }

    public void setAges(int ages) {
        this.ages = ages;
    }
    public String getInformationToCSV(){
        return this.id+","+this.name+","+this.ages;
    }
}
