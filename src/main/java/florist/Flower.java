package florist;

public class Flower {

    private String name;
    private String color;
    private int amount;
    private double price;

    public Flower(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
        price = PriceList.getInstance().getPrice(name);
    }


    public String toString() {
        return String.format("%s, kolor: %s, ilość %d, cena %.1f",
                name,color,amount,price);
    }

    // róża, kolor: czerwony, ilość 5, cena 10.0

}
