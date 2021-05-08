package java8;

import java.util.ArrayList;
import java.util.Arrays;
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



        //metoda ma zwrócić listę napisów formatowanych w nastepujący sposób:
        // "Produkt: <nazwa> kosztuje <kwota>zł" na bazie przechowywanych produktów

  /*  wersja podstawowa
   public List<String>  getProductsDescriptions (){
      return   products.stream()  // Stream<Product>
                .map( (Product product) -> {
                    String name = product.getName();
                    double price = product.getPrice();
                    return "Produkt: " + name + " kosztuje " + price + " zł";
                }  )         //Stream<String>
        .collect(Collectors.toList());
    }*/

    //skrocone
    public List<String>  getProductsDescriptions (){
        return   products.stream()  // Stream<Product>
                .map( product ->  String.format("Produkt: %s kosztuje %.2f zł",product.getName(), product.getPrice()))  // podstawianie zmiennych do szablonu
                .collect(Collectors.toList());
    }

    //zwraca listę unikatowych komponentów
 /*   public List<String> getAllComponents() {
       return products.stream()   //Stream<Product>
                .map(product -> product.getComponents())  //Stream<List<String>>
                .collect(Collectors.toList());
    }*/

    public List<String> getAllComponents() {
        return products.stream()   //Stream<Product>
                .flatMap(product -> product.getComponents().stream())  //Stream<String>
                .distinct()
                .collect(Collectors.toList());
    }


    public double getAveragePrice(){
        return products.stream()
                .mapToDouble(product -> product.getPrice()) // przemapowujemy ze zwykłego Streama na stream liczbowy
                //.boxed()  // wyjście do zwykłego Stream
                .average()
                .orElse(-1);
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

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }
}

class Product{

    private String name;
    private double price;
    private List<String> components;


    Product(String name, double price) {
        this.name = name;
        this.price = price;
        components = new ArrayList<>();
    }

    public void addComponents(String... newComponents){
        components.addAll(Arrays.asList(newComponents));
    }




    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    List<String> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", components=" + components +
                '}';
    }
}
