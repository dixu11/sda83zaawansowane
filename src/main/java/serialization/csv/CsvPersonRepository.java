package serialization.csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class CsvPersonRepository implements PersonRepository {

    public static final String FILE_NAME = "src/main/java/serialization/csv/people.csv";

    @Override
    public List<Person> loadPeople() {
        List<Person> people = new ArrayList<>();
        try {
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fr);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Person person = mapToPerson(line);
                people.add(person);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Problem z połączeniem z plikiem");
        }

        return people;
    }

    @Override
    public void savePeople(List<Person> people) {
        //BufferedWriter - standardowy sposób
        try {
            PrintWriter out = new PrintWriter(FILE_NAME);
            for (Person person : people) {
                out.println(person.toCsv());
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
