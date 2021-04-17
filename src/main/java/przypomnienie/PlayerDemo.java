package przypomnienie;

class PlayerDemo {
    public static void main(String[] args) {
        Player warrior = new Player("swordmaster",300);
//        warrior.hp = 300;
//        warrior.profession = "swordmaster";
        Player mage = new Player("spellcaster",150);
//        mage.hp = 150;
//        mage.profession = "spellcaster";

//        System.out.println(warrior.hp);
//        System.out.println(warrior.profession);

//        System.out.println(mage.hp);
//        System.out.println(mage.profession);

        warrior.display();
        mage.display();
        warrior.heal(20);
        warrior.display();




    }
}
