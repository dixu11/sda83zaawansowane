package serialization.bin;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

class Person implements Serializable {

    private String name;
    private int age;
    private Address address;
    private transient Scanner scanner = new Scanner(System.in); // nie serializuj tego pola

    private static final long serialVersionUID = 1043911118351116212L;


    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    String getName() {
        return name;
    }

    int getAge() {
        return age;
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
                '}';
    }
}
