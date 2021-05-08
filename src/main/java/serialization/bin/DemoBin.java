package serialization.bin;

class DemoBin {
    public static void main(String[] args) {
//        Address address = new Address("Wojska Polskiego", 10);
//        Person person = new Person("Artur", 33, address);
        FilePersonRepository repository = new FilePersonRepository();
//        repository.savePerson(person);

        Person person = repository.loadPerson().orElseThrow(); //jeśli dostane pusty optional rzuć wyjątek
        System.out.println("Odczytane z pliku " + person);

    }

}
