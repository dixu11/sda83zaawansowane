package rozwiazania.zaawansowane.zad10;

class Card {
    //cechy
    private Rank rank;
    private Suit suit;

    public Card(Rank rank,Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getStrength() {
       return rank.getStrength();
    }

    @Override
    public String toString() {
        return  rank.toString() +" "+ suit.toString();
    }


}








