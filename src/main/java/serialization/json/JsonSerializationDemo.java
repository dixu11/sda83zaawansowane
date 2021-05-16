package serialization.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class JsonSerializationDemo {
    public static void main(String[] args) {
        //pochodzi z dependency do Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        Address address = new Address("Wojska Polskiego", 10);
        Person examplePerson = new Person("Artur", 33, address);
        //Jackson, Gson -> biblioteki do formatu json

        //zapis do Stringa lub pliku
        try {
            //do Stringa
            String addressAsJson = objectMapper.writeValueAsString(address);
            System.out.println(addressAsJson);
            //do pliku
            objectMapper.writeValue(new File("address.json"), address);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //odczyt ze stringa lub pliku
        try {
            File file = new File("src/main/java/serialization/json/person.json");
           //przekazanie klasy: nazwa.class aby wiedział na co mapować
            Person person= objectMapper.readValue(file, Person.class);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //UWAGA, wymagane:
        // publiczny bezparametrowy konstruktor
        // gettery!

    }
}
