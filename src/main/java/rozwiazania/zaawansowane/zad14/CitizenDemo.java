package rozwiazania.zaawansowane.zad14;

/*
Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
        Peasant(Chłop),
        Townsman(Mieszczanin),
        King(Król),
        Soldier(Żołnierz)
        Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole).
        Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote'
         która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.

        Stwórz klasę Town która posiada zbiór obiektów typu Citizen.
         Dodaj do niej kilku citizenów (tworząc ich w main).
         Obiekt klasy Town ma mieć metody:
        howManyCanVote -  które zwracają ilość osób które mogą głosować
        whoCanVote -  która wypisuje imiona osób które mogą głosować
*/


class CitizenDemo {
    public static void main(String[] args) {
        King king = new King("Artur");
        Peasant peasant = new Peasant("Romek");
        Soldier soldier = new Soldier("Conan");
        Townsman townsman = new Townsman("Janusz");

        System.out.println(king.canVote());
        System.out.println(peasant.canVote());
        System.out.println(soldier.canVote());
        System.out.println(townsman.canVote());

        Town town = new Town();
        town.addCitizen(king);
        town.addCitizen(peasant);
        town.addCitizen(soldier);
        town.addCitizen(townsman);

        int howMany = town.howManyCanVote();
        System.out.println("Może głosować " + howMany + " osób");
        town.whoCanVote();
    }
}
