package dziedziczenie;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno", 6);
        dog.makeSound();
        dog.fetch();
        dog.eat();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.makeSound();
        cat.sleep();
        cat.eat();
        System.out.println(cat);
        System.out.println("-- guide --");
        Cow cow = new Cow();
        AnimalGuide guide = new AnimalGuide();
        guide.feedAnimal(dog);
        guide.feedAnimal(cat);
        guide.feedAnimal(cow);

//       Animal animal = new Animal();
        //nie można zrobić obiektu bezpośrednio z klasy abstrakcyjne

        Animal animal2 = new Dog();
    }
}

class AnimalGuide{
    // jak zrobić jedną metodę i przekazywać jej kota lub psa?

    public void feedAnimal(Animal animal){
        System.out.println("Karmię zwierzę");
        animal.eat();  //polimorfizm
        animal.makeSound();
    }

   /* public void feedCat(Cat cat){
        System.out.println("Karmię kota");
        cat.eat();
    }*/

}


