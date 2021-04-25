package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Shop {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> findAllProductsBelow(double price) {
        List<Product> filtered = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() <= price) {
                filtered.add(product);
            }
        }
        return filtered;
    }

    public List<Product> findAllProductsBelowStream(double price) {
        return products.stream() // otwieram stream
                .filter(product -> product.getPrice() <= price) //odfiltrowuję wg predykatu
                .collect(Collectors.toList()); // zbieram do listy
    }


}

class Product{

    private String name;
    private double price;


    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
