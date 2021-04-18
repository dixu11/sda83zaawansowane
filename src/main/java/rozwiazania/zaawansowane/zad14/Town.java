package rozwiazania.zaawansowane.zad14;

import java.util.ArrayList;

class Town {
    //cechy
    private ArrayList<Citizen> citizens = new ArrayList<>();

    //zachowania
    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }

    //howManyCanVote -  które zwracają ilość osób które mogą głosować
    public int howManyCanVote(){
        int counter = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counter++;
            }
        }
        return counter;
    }

    //whoCanVote -  która wypisuje imiona osób które mogą głosować
    public void whoCanVote(){
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println("Może głosować: " + citizen.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + citizens +
                '}';
    }
}
