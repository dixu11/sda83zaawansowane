package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Shop {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }


    public Product findProductBy(String name) {
        return products.stream()
                .filter(product -> product.getName().equals(name))
                .findAny()
                .orElse(new Product("Ocet", 2));
    }

    //taka metoda może: zwracać po prostu optional: Optional<Product>
    //może rzucić wyjątek wtedy na koniec damy sobie: orElseThrow
    //może zwrócić null: orElse(null)
    //może zwrócić alternatywe orElse(new Product())

    public Optional<Product> findProductBy2(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public Optional<Product> findProductBy3(String name) {
        Product found = null;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                found = product;
                break;
            }
        }
        return Optional.ofNullable(found);
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
