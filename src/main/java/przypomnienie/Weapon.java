package przypomnienie;

import java.util.Random;

class Weapon {

    private String name;
    private int minDmg;
    private int maxDmg;
    private int durability;

    Weapon(String name, int minDmg, int maxDmg, int durability) {
        this.name = name;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.durability = durability;
    }

    public int attack() {
        durability--;
        if (durability < 0) {
            durability = 0;
            System.out.println("Broń zepsuta");
            return 0;
        }

        Random random = new Random();
        int dmg = random.nextInt(maxDmg-minDmg-1)+minDmg;
        System.out.println("Attack with " + name + " for " + dmg);
        return dmg;
    }

    public boolean isBroken() {
        return durability < 0;
    }

    public String toString() {
        return name;
    }

}
