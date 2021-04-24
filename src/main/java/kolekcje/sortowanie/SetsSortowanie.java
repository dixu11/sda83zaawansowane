package kolekcje.sortowanie;

import java.util.*;

class SetsSortowanie {
    public static void main(String[] args) {
        Person p1 = new Person("Marcin",23);
        Person p2 = new Person("Maria",22);
        Person p4 = new Person("Anna",20);
        Person p3 = new Person("Adam",20);
        Person p5 = new Person("Kordian",35);
        List<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
/*
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });*/

        Collections.sort(people);
        System.out.println(people);

        //HashSet -> porządek przyadkowy
        //LinkedHashSet -> kolejność wg wstawienia wartości
        //TreeSet -> posortowane automatycznie z wykorzystaniem COMPARABLE (NATURAL ORDERING)

        // łamię domyślne działanie TreeSetu(wykorzystywanie comparable) i daję mu comparator z którego ma korzystać zamiast tego
        TreeSet<Person> peopleSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        peopleSet.add(p1);
        peopleSet.add(p2);
        peopleSet.add(p3);
        peopleSet.add(p4);
        peopleSet.add(p5);

        System.out.println(peopleSet);


        System.out.println("------");
        Set<Person> equalsDemoSet = new TreeSet<>();
        equalsDemoSet.add(new Person("Marcin", 11));
        equalsDemoSet.add(new Person("Julia", 11));
        System.out.println(equalsDemoSet);
    }
}


class Person implements Comparable<Person>{
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        int result = age - o.age;
        if (result == 0) {
            result = name.compareTo(o.name);
        }

        return result;
    }
}
