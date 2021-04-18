package dziedziczenie.model;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name,age);
    }

    public Dog() {
        super("Burek",3);
    }

    @Override
    public void makeSound() {
        System.out.println("Hau hau!");
    }

    public void fetch() {
        System.out.println(name + " aportuje!");
    }

    @Override
    public void eat() {
        super.eat(); // oryginalne działanie z klasy bazowej
        System.out.println("Pies je karmę dla psa");
    }

}
