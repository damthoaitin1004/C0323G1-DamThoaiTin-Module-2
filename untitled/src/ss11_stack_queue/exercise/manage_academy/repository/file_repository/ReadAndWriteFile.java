package ss11_stack_queue.exercise.manage_academy.repository.file_repository;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;
import ss11_stack_queue.exercise.manage_academy.model.academy.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void main(String[] args) {
//        List<Person>student=new ArrayList<>();
//        student.add(new Student("Dam Thoai Tin", true, "0325", 9, "0323g1"));
//        student.add(new Student("Dam Vinh Hung", false, "03265", 9, "0323g1"));
//        ReadAndWriteFile.writeStudentList(student,"ss11_stack_queue/exercise/manage_academy/repository/file_repository/student.csv");
////       List<Person>p= WriteFile.readStudentList("ss11_stack_queue/exercise/manage_academy/repository/file_repository/student.csv");
////        for (Person o:p) {
////            System.out.println(o);
////        }
//        List<Person>teacher=new ArrayList<>();
//        teacher.add(new Teacher("Hai BĐ",true,"0555","Thực hành"));
//        teacher.add(new Teacher("Sơn Tùng ATM",false,"0245","Tấu hài"));
//        writeStudentList(teacher,"E:\\codegym\\module_2\\untitled\\src\\ss11_stack_queue\\exercise\\manage_academy\\repository\\file_repository\\teacher.csv");
    }
    public static void writeStudentList(List<Person> person, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person p : person) {
                bufferedWriter.write(p.getInformation());
                bufferedWriter.newLine();

            }bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
   public static List<Person> readStudentList(String path){
        List<Person> studentList = new ArrayList<>();
//       (String name, boolean gender, String codePerson, int point, String classes
        try {
            File file = new File(path);
            FileReader fileReader ;
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine()) != null){
                String[] arrString = line.split(",");
                studentList.add(new Student(arrString[0],Boolean.parseBoolean(arrString[1]),arrString[2],Integer.parseInt(arrString[3]), arrString[4]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
    public static List<Person> readTeacherList(String path){
        List<Person> teacherList = new ArrayList<>();

        try {
            File file = new File(path);
            FileReader fileReader ;
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine()) != null){
                String[] arrString = line.split(",");
                teacherList.add(new Teacher(arrString[0],Boolean.parseBoolean(arrString[1]),arrString[2],arrString[3]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return teacherList;
    }
}
