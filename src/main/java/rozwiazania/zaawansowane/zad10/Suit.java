package rozwiazania.zaawansowane.zad10;

enum Suit {
    SPADES("pik"),
    HEARTS("kier"),
    DIAMONDS("karo"),
    CLUBS("trefl");

    private String polishName;

    Suit(String polishName){
        this.polishName = polishName;
    }

    public String toString(){
        return polishName;
    }
}
