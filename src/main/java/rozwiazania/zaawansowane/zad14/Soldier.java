package rozwiazania.zaawansowane.zad14;

class Soldier extends Citizen{

    Soldier(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
