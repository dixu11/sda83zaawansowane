package interfaces;

import interfaces.model.*;

import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {
        DomesticCat cat = new DomesticCat();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        AnimalGuide guide = new AnimalGuide();
        guide.feedAnimal(cat);
        guide.feedAnimal(dog);
       // guide.feedAnimal(tiger);
    }

}

class AnimalGuide {

    public void feedAnimal(FriendlyAnimal animal) {
        System.out.println("Karmię zwierzę");
        animal.eat();
        animal.makeSound();
    }

}
