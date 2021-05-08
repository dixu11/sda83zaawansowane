package serialization.csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class CsvPersonLoader implements PersonLoader {
    @Override
    public List<Person> loadPeople() {
        String fileName = "src/main/java/serialization/csv/people.csv";
        List<Person> people = new ArrayList<>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fr);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Person person = mapToPerson(line);
                people.add(person);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Problem z połączeniem z plikiem");
        }

        return people;
    }



    public List<Person> loadPeople2() {
        String fileName = "src/main/java/serialization/csv/people.csv";
        try {
           return new BufferedReader(new FileReader(fileName))
                    .lines()
                    .map(line -> mapToPerson(line))
                    .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie znaleziony");
        }
        return Collections.emptyList();
    }



    private Person mapToPerson(String csvLine) {
        String[] elements = csvLine.split(",");
        String name = elements[0];
        int age = Integer.parseInt(elements[1]);
        return new Person(name, age);
    }
}
