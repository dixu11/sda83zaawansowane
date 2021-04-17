package przypomnienie;

class Player {

    //cechy
    private String profession;
    private int maxHp;
    private int hp;

    //konstruktory
    public Player(String profession, int hp, int maxHp) {
        this.profession = profession;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    public Player(String profession, int maxHp) {
        this.profession = profession;
        this.maxHp = maxHp;
        hp = maxHp; // startowe hp - w pełni wyleczony
    }

    //zachowania
    public void display() {
        System.out.println("I am " + profession);
        System.out.println("Hp: " + hp);
    }

    public void heal(int hpToHeal) {
        if (hp + hpToHeal > maxHp) {
            hp = maxHp;
        } else {
            hp += hpToHeal;
        }
    }

    int getHp() {
        return hp;
    }
}
