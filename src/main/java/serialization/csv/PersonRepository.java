package serialization.csv;

import java.util.List;

interface PersonRepository {

    List<Person> loadPeople();

    void savePeople(List<Person> people);


}
