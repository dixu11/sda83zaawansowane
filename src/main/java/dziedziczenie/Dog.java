package dziedziczenie;

class Dog extends Animal{
    //Jak ograniczyć powtórki?
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog() {
        name = "Burek";
        age = 3;
    }

    @Override
    public void makeSound() {
        System.out.println("Hau hau!");
    }

    public void fetch(){
        System.out.println(name + " aportuje!");
    }

    @Override
    public void eat(){
        super.eat(); // oryginalne działanie z klasy bazowej
        System.out.println("Pies je karmę dla psa");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
