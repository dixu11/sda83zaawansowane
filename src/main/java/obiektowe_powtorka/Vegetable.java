package obiektowe_powtorka;

public class Vegetable {

    private int timeToCook;
    private String name;

    private boolean cooked = false;
    private boolean chopped = false;

    public Vegetable(int timeToCook, String name) {
        this.timeToCook = timeToCook;
        this.name = name;
    }

    public void cookFor(int minutes){
        if (minutes >= timeToCook) {
            cooked = true;
        }
    }

    public void eat() {
        if (cooked) {
            System.out.println("Pyszna " + name + " :) ");
        } else {
            System.out.println("Niedogotowana " + name + " :( ");
        }
    }

    public int getTimeToCook() {
        return timeToCook;
    }

    public String getName() {
        return name;
    }

}
