package serialization.bin;

import java.io.*;
import java.util.Optional;

class FilePersonRepository {

    public static final String FILE_NAME = "src/main/java/serialization/bin/person.bin";

    public void savePerson(Person person) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(person);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Optional<Person> loadPerson() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            Person person = (Person) ois.readObject();
            ois.close();
            return Optional.of(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }


}
