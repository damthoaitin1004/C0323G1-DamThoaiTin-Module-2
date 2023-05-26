package ss16_text_file.exercise.read_file.source_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateFile {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        File file = new File("ss16_text_file/exercise/read_file/country.csv");
        Country country1 = new Country(1, "US", "American");
        Country country2 = new Country(2, "CN", "China");
        Country country3 = new Country(3, "JP", "Japan");
        Country country4 = new Country(4, "TL", "Thailand");
        Country country5 = new Country(5, "AU", "Australia");
        Country country6 = new Country(6, "VN", "Vietnam");
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        writerFile(countries, "ss16_text_file/exercise/read_file/country.csv");

    }


    static void writerFile(List<Country> people, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Country p : people) {
                bufferedWriter.write(p.getInformation());
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
