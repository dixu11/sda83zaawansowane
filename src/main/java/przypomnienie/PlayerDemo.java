package przypomnienie;

class PlayerDemo {
    public static void main(String[] args) {
        Weapon sword = new Weapon("sword",20,40,5);
        Weapon wand = new Weapon("wand", 0, 100, 6);
        Player warrior = new Player("swordmaster",300,sword);
//        warrior.hp = 300;
//        warrior.profession = "swordmaster";
        Player mage = new Player("spellcaster",150,wand);
//        mage.hp = 150;
//        mage.profession = "spellcaster";

//        System.out.println(warrior.hp);
//        System.out.println(warrior.profession);

//        System.out.println(mage.hp);
//        System.out.println(mage.profession);


        warrior.heal(20);
        System.out.println(warrior);


        warrior.attack();






    }
}
