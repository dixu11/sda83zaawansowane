package florist;

import java.util.HashMap;
import java.util.Map;

public class PriceList {

    static PriceList instance = new PriceList();
    private Map<String, Double> prices = new HashMap<>();

    private PriceList() {

    }

    public static PriceList getInstance() {
        return instance;
    }

    public void put(String flowerName, double price) {
        prices.put(flowerName, price);
    }

    public double getPrice(String name) {
        return prices.getOrDefault(name,-1.);
    }
}
