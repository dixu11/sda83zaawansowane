package wyjatki;

class Product {
    private double price;
    private String name;

    Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
