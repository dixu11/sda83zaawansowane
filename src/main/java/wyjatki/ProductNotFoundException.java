package wyjatki;

class ProductNotFoundException extends Exception {

    ProductNotFoundException(String name) {
        super("Nie znaleziono produktu o nazwie: " + name);
    }
}
