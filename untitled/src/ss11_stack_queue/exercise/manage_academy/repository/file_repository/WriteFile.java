package ss11_stack_queue.exercise.manage_academy.repository.file_repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void writeStudentList(List<Person> person, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person p : person) {
                bufferedWriter.write(p.getInformation());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static List<Person> readStudentList(String path){
        List<Person> studentList = new ArrayList<>();

        try {
            File file = new File(path);
            FileReader fileReader = null;
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine()) != null){
                String[] arrString = line.split(",");
                studentList.add(new Student(arrString[0],arrString[1],Boolean.parseBoolean(arrString[2]),Integer.parseInt(arrString[3]),arrString[4]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}
