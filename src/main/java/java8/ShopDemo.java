package java8;

import java.util.Optional;

class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add(new Product("chleb",3));
        shop.add(new Product("mleko",2.5));
        shop.add(new Product("jajka", 6));

        System.out.println(shop.findAllProductsBelow(5));
        System.out.println(shop.findAllProductsBelowStream(5));
        System.out.println(shop.findProductBy("chleb"));
        System.out.println(shop.findProductBy("woda"));

        System.out.println("-------");


        Product product = new Product("jajka", 6);

        if (Math.random() >= 0.5) {
            product = null;
        }

        //zapakowywanie
        //jeśli wiemy że jest ( jeśli damy nulla to nullpointer)
        Optional<Product> productOptional1 = Optional.of(new Product("chleb", 3)); //wstawiamy obiekt
        //jeśli wiemy że nie ma
        Optional<Product> productOptional2 = Optional.empty();
        //jeśli nie wiemy co wstawiamy
        Optional<Product> productOptional3 = Optional.ofNullable(product);

        System.out.println(productOptional1);
        System.out.println(productOptional2);
        System.out.println(productOptional3);

        //odpakowywanie
        //zwykłe wyjecie zawartości
        Product productFromOptional = productOptional1.get();
        System.out.println(productFromOptional);
        //wyjęcie z pustego
//        Product productFromOptional2 = productOptional2.get(); // rzuci wyjatek bo optional jest pusty
        //wyjecie z nieokreślonego
        if (productOptional3.isPresent()) {
            System.out.println("Był obecny:");
            Product existingProduct = productOptional3.get();
            System.out.println(existingProduct);
        }
        //zrob coś jeśli obecny
        productOptional3.ifPresent( p -> System.out.println("Był obecny: " + p));
        //daj alterterantywną zawartość jeśli nieobecny
        Product znaleziony = productOptional3.orElse(new Product("Ocet", 2));
        System.out.println("Znaleziono w pudełku: " + znaleziony);
       // Product znaleziony2 = productOptional3.orElseThrow();
        Product znaleziony2 = productOptional3.orElseThrow( () -> new NullPointerException("Lipa") );
        System.out.println("Nie rzucił wyjątku tylko znalazł: " + znaleziony2);


    }
}
