package dziedziczenie.model;

public abstract class Animal {

    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Zwierze je");
    }

    public abstract void makeSound();
    //metoda abstrakcyjna nie ma ciała i MUSI być nadpisywania w dziedziczących nie abstrakcyjnych klasach


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//private
//default
//protected
//public
