package ss16_text_file.exercise.copy_file;

import ss16_text_file.exercise.copy_file.source_file.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peopleListFromFile = readPeopleListFromFile("ss16_text_file/exercise/copy_file/people.csv");
        System.out.println("Khời tạo 1 file coppy từ file ss16_text_file/exercise/copy_file/people.csv ");
        while (true) {
            System.out.println("Nhập tên file bạn muốn khởi tạo ");
            String stringPath = scanner.nextLine();
            if(stringPath.equals("")) {
                System.out.println("Sai duong dan");
                continue;
            }
            File coppyFile = new File(stringPath);
            if (coppyFile.exists()) {
                System.out.println("file đã tồn tại");
            } else {
                System.out.println("file chưa tồn tại băt đầu khởi tạo file");
                writerFile(peopleListFromFile, stringPath);
                System.out.println("Số kí tự đã có sẵn trong file là " + chartOfFilePeople("ss16_text_file/exercise/copy_file/people.csv"));
                break;
            }

        }
    }


    static List<Person> readPeopleListFromFile(String path) {
        List<Person> peoplelist = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] peopleArr = line.split(",");
                Person people = new Person(Integer.parseInt(peopleArr[0]), peopleArr[1], Integer.parseInt(peopleArr[2]));
                peoplelist.add(people);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return peoplelist;
    }

    static int chartOfFilePeople(String path) {
        String string = "";

        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                string += line;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return string.length();
    }

    static void writerFile(List<Person> people, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person p : people) {
                bufferedWriter.write(p.getInformationToCSV());
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi");
        }
    }

}
