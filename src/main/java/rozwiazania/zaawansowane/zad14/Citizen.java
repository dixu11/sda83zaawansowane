package rozwiazania.zaawansowane.zad14;

abstract class Citizen {
   private String name;

    Citizen(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

    String getName() {
        return name;
    }
}
