package dziedziczenie;

class Cat extends Animal{

    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Cat() {
        name = "Kleofacy";
        age = 3;
    }

    @Override
    public void makeSound() {
        System.out.println("Miał!");
    }

    public void sleep() {
        System.out.println("Idzie spać...");
    }

    @Override
    public void eat(){
        System.out.println("Kot je mysz");
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
