package kolekcje.sets;

import java.util.*;

class SetsDemo {
    public static void main(String[] args) {
        //wszystkie sety odrzucają powtórki
        //HashSet -> kolejność przypadkowa
        //LinkedHashSet -> kolejność wg. wstawiania
        //TreeSet -> kolejność posortowana (wg. Comparable)

        Set<String> namesSet = new TreeSet<>();
        namesSet.add("Zofia");
        namesSet.add("Maria");
        namesSet.add("Anna");
        namesSet.add("Kuba");
        namesSet.add("Zenon");
        namesSet.add("Anna");
        namesSet.add("Daniel");
        namesSet.add("Martyna");
        System.out.println(namesSet);

        if (namesSet.contains("Maria")) {
            System.out.println("Zawiera element");
        }

        for (String imie : namesSet) {
            System.out.print(imie + ", ");
        }
        System.out.println();
        System.out.println("----------------------");
        Set<Person> people = new HashSet<>();


        people.add(new Person("Zofia"));
        people.add(new Person("Maria"));
        people.add(new Person("Anna"));
        people.add(new Person("Kuba"));
        people.add(new Person("Zenon"));
        people.add(new Person("Anna"));
        System.out.println(people);
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
