package rozwiazania.zaawansowane.zad10;

enum Rank {
    NINE("dziewiątka",9),
    TEN("dziesiątka",10),
    JACK("jopek",11),
    QUEEN("królowa",12),
    KING("król",13),
    ACE("as",14);

    private String polishName;
    private int strength;

    Rank(String polishName, int strength) {
        this.polishName = polishName;
        this.strength = strength;
    }

    int getStrength() {
        return strength;
    }

    public String toString() {
        return polishName;
    }
}
