package przypomnienie;

class Player {

    //cechy
    private String profession;
    private int maxHp;
    private int hp;
    private Weapon weapon;

    //konstruktory
    public Player(String profession, int hp, int maxHp,Weapon weapon) {
        this.profession = profession;
        this.hp = hp;
        this.maxHp = maxHp;
        this.weapon = weapon;
    }

    public Player(String profession, int maxHp,Weapon weapon) {
        this.profession = profession;
        this.maxHp = maxHp;
        hp = maxHp; // startowe hp - w pełni wyleczony
        this.weapon = weapon;
    }

    //zachowania
    public void heal(int hpToHeal) {
        if (hp + hpToHeal > maxHp) {
            hp = maxHp;
        } else {
            hp += hpToHeal;
        }
    }

    public void attack() {
        System.out.println(profession + " is attacking");
        weapon.attack();
    }


    int getHp() {
        return hp;
    }

    public String toString(){
        return "I am " + profession + " Hp: " + hp + "/"+maxHp + " with weapon: " + weapon;
    }
}
