package serialization.csv;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PersonLoaderTest {

   private PersonRepository repository = new CsvPersonRepository();

    @Test
    public void shouldLoadPeopleFromCsv(){
        //given
        List<Person> expectedList =createPeopleList();

        //when
        List<Person> result = repository.loadPeople();

        //than
        assertThat(result).isEqualTo(expectedList);

    }


    @Test
    public void shouldCreateProperCSVFile() {
        //given
        File oldFile =new File( CsvPersonRepository.FILE_NAME);
        oldFile.delete(); // skasuj plik jeśli jest jakiś

        List<Person> dataToSave = createPeopleList();
        //when
        repository.savePeople(dataToSave);
        //than
        List<Person> loaded = repository.loadPeople();
        assertThat(loaded).isEqualTo(dataToSave);
    }

    private List<Person> createPeopleList() {
        Person person1 = new Person("Marcin",30);
        Person person2 = new Person("Julia",25);
        Person person3 = new Person("Marta", 40);
        return List.of(person1, person2, person3);
    }

}
