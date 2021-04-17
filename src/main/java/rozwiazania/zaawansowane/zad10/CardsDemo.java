package rozwiazania.zaawansowane.zad10;

class CardsDemo {
/*
*
Stwórz obiekt typu Karta (Card). Kartę będą opisywać dwa pola klas
* enumowych Rank(Ranga np. dziewiątka, as)
*  oraz Suit (Kolor - np. pik).
Stwórz dwie dowolne karty w mainie, różniące się rangą i kolorem, zaprezentuj je wykorzystując nadpisaną
*  metodę toString.
W mainie wyświetl wszystkie możliwe rangi wykorzystując statyczną metodę enumów - values().
Każda z rang ma mieć przypisaną siłę, dla dwójki 2, trójki 3 itd.
Obiekty kart mają mieć metodę pozwalającą na pobranie siły karty. Stwórz dodatkowy serwis pozwalający
*  porównać dwie karty, drukujący tą która jest większa.
Stwórz listę wszystkich możliwych rang w kolorze pik. (wykorzystaj pętle dla automatyzacji zadania)
Stwórz całą talię, czyli listę wszystkich możliwych rang dla wszystkich możliwych kolorów.

*
*
* */

    public static void main(String[] args) {
        Card card1 = new Card(Rank.ACE,Suit.CLUBS);
        System.out.println(card1);
        Card card2 = new Card(Rank.QUEEN, Suit.DIAMONDS);
        System.out.println(card2);

        Week week = Week.CZWARTEK;


    }
}
