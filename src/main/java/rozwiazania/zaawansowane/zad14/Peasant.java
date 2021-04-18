package rozwiazania.zaawansowane.zad14;

class Peasant extends Citizen{

    Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
