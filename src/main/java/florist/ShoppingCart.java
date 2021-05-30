package florist;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private Customer customer;
    private List<Flower> flowers;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        flowers = new ArrayList<>();
    }

    public void add(Flower flower){
        flowers.add(flower);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Wózek właściciel ")
                .append(customer.getName());
        for (Flower flower : flowers) {
            result.append(flower)
                    .append("\n");
        }
        result.setLength(result.length()-1); // wywala ostatni enter
        return  result.toString();
    }
}
