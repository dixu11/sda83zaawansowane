package rozwiazania.zaawansowane.zad14;

class Townsman extends Citizen{

    Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
