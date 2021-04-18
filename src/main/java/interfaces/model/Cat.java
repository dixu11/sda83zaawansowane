package interfaces.model;

public abstract class Cat extends Animal {

   public Cat(String name, int age) {
       super(name,age);
    }

   public Cat() {
       super("Kleofacy", 3);
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
}
