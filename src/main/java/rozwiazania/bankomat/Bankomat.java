package rozwiazania.bankomat;

public class Bankomat {

    private double money;
    private int pin;

    public Bankomat(double money, int pin) {
        this.money = money;
        this.pin = pin;
    }

    public Bankomat(int pin){
        money = 5000;
        this.pin  = pin;
    }

    void takeMoney(double howMoneyYouNeed) {
        if(!hasEnoughMoney(howMoneyYouNeed)){
            return;
        }
        if (howMoneyYouNeed <= 0) {
            return;
        }
        money = money - howMoneyYouNeed;
    }

    //można wpłacić na raz max 5000
    void deposit(double cash) {

    }

    public boolean hasEnoughMoney(double howMoneyYouNeed){
        return money >= howMoneyYouNeed;
    }

    //można wypłacić na raz max 1000
    public boolean isPinCorrect(int pin){
        if (this.pin == pin) {
            return true;
        } else {
            return false;
        }
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Bankomat{" +
                "money=" + money +
                ", pin=" + pin +
                '}';
    }

}
