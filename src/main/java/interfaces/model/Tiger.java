package interfaces.model;

import interfaces.FriendlyAnimal;
import interfaces.WildAnimal;

public class Tiger extends Cat implements WildAnimal {

    @Override
    public void eat() {
        System.out.println("Tygrys je opiekuna");
    }
}
