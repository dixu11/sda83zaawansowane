package serialization.csv;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonLoaderTest {

    @Test
    public void shouldLoadPeopleFromCsv(){
        //given
        PersonLoader loader = new CsvPersonLoader();
        Person person1 = new Person("Marcin",30);
        Person person2 = new Person("Julia",25);
        Person person3 = new Person("Marta", 40);
        List<Person> expectedList = List.of(person1, person2, person3);

        //when
        List<Person> result = loader.loadPeople();

        //than
        assertThat(result).isEqualTo(expectedList);

    }

}
