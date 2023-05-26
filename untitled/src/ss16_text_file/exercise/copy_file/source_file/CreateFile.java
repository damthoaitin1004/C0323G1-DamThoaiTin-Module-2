package ss16_text_file.exercise.copy_file.source_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateFile {  //public Person(int id, String name, int ages) {

    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        File file = new File("ss16_text_file/exercise/copy_file/people.csv");
        Person people1 = new Person(01,"Tin",26);
        Person people2= new Person(02,"Trí",29);
        Person people3= new Person(03,"Pháp",25);
        people.add(people1);
        people.add(people2);
        people.add(people3);
         writerFile(people, "ss16_text_file/exercise/copy_file/people.csv");
    }


    static void writerFile(List<Person> people,String path){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person p: people) {
                bufferedWriter.write(p.getInformationToCSV());
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
