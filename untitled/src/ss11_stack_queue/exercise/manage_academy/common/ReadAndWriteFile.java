package ss11_stack_queue.exercise.manage_academy.common;

import ss11_stack_queue.exercise.manage_academy.model.Person;
import ss11_stack_queue.exercise.manage_academy.model.academy.Student;
import ss11_stack_queue.exercise.manage_academy.model.academy.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void main(String[] args) {

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
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i =0;i<person.size();i++) {
                bufferedWriter.write(person.get(i).getInformation());
                bufferedWriter.newLine();

            }bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("lỗi file");
        }
    }
   public static List<Person> readStudentList(String path){
       List<Person> studentList = new ArrayList<>();
       File file = new File(path);
       try {

           FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line = null;
           while ((line=bufferedReader.readLine()) != null){
               String[] arrString = line.split(",");
               Person  newStudent =new Student(arrString[0],Boolean.parseBoolean(arrString[1]),arrString[2],Integer.parseInt(arrString[3]),arrString[4]);
               studentList.add(newStudent);
           }
       } catch (FileNotFoundException e) {
           System.out.println("lỗi file");
       } catch (IOException e) {
           System.out.println("lỗi file");
       }
       return studentList;
   }

    public static List<Person> readTeacherList(String path){
        List<Person> teacherList = new ArrayList<>();
        File file = new File(path);
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine()) != null){
                String[] arrString = line.split(",");
              Person  newTeacher =new Teacher(arrString[0],Boolean.parseBoolean(arrString[1]),arrString[2],arrString[3]);
                teacherList.add(newTeacher);
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi file");
        } catch (IOException e) {
            System.out.println("lỗi file");
        }
        return teacherList;
    }
}
