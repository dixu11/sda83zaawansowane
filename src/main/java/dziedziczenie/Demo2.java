package dziedziczenie;

import dziedziczenie.model.Animal;
import dziedziczenie.model.Cat;
import dziedziczenie.model.Dog;

class Demo2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal2 = new Cat();

        Animal randomAnimal;

        if (Math.random() > 0.5) {  // 0.0 - 1.0
            System.out.println("Robie psa");
            randomAnimal = new Dog();
        } else {
            System.out.println("Robie kota");
            randomAnimal = new Cat();
        }

        randomAnimal.eat();

        System.out.println(randomAnimal instanceof Cat);
        System.out.println(randomAnimal instanceof Dog);
        System.out.println(randomAnimal instanceof Animal);

        if (randomAnimal instanceof Cat) {
            Cat cat = (Cat) randomAnimal;
            cat.sleep();
        } else {
            Dog dog = (Dog) randomAnimal;
            dog.fetch();
        }


    }
}
