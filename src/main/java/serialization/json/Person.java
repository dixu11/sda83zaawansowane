package serialization.json;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Person  {

    private String name;
    private int age;
    private Address address;
    private List<String> nickNames;

    //wymagany domyślny (bezparametrowy) konstruktor
    public Person(){

    }

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


   public String getName() {
        return name;
    }

   public int getAge() {
        return age;
    }

   public Address getAddress() {
        return address;
    }

   public List<String> getNickNames() {
        return nickNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", nickNames=" + nickNames +
                '}';
    }
}
