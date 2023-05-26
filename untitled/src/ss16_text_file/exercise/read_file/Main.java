package ss16_text_file.exercise.read_file;

import ss16_text_file.exercise.read_file.source_file.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Country> newCountry = readFileCountry("ss16_text_file/exercise/read_file/country.csv");
        for (Country c:newCountry) {
            System.out.println(c);
        }
    }


    static List<Country> readFileCountry(String path) {
        List<Country> countriesList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
              String line = null;
              while ((line = bufferedReader.readLine())!= null){
                  String[] countryArr = line.split(",");
                  Country countryNew = new Country(Integer.parseInt(countryArr[0]),countryArr[1],countryArr[2]);
                  countriesList.add(countryNew);
              }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
          return countriesList;
    }
}
