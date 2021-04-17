package rozwiazania.zaawansowane.zad10;

class War {

    public void fight(Card card1, Card card2) {
        System.out.println("Pojedynek " + card1 + " z " + card2);
        if (card1.getStrength() > card2.getStrength()) {
            System.out.println("Wygrywa " + card1);
        } else if (card1.getStrength() == card2.getStrength()) {
            System.out.println("Remis!");
        } else {
            System.out.println("Wygrywa " + card2);
        }
    }

}
