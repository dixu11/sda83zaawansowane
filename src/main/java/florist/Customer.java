package florist;

public class Customer {

    private String name;
    private double cash;
    private ShoppingCart cart;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        cart = new ShoppingCart(this);
    }

    public void add(Flower flower) {

    }

    public ShoppingCart getShoppingCart() {
        return cart;
    }
}
