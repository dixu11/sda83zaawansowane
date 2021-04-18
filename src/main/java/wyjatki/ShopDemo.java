package wyjatki;

import java.util.NoSuchElementException;
import java.util.Scanner;

class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new Product(3, "mleko"));
        shop.addProduct(new Product(3.5, "chleb"));
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwę produktu: ");
            String productName = scanner.nextLine();
            Product product = shop.findProductByName(productName);

            System.out.println("Znaleziono: " + product);
            System.out.println("Cena: " + product.getPrice() + "zł");

        } catch (ProductNotFoundException e) {
            System.out.println("Nie znalziono!");
            System.out.println(e.getMessage());
        }finally { // wykonuje się bez względu na to czy wystąpi wyjątek czy nie
            System.out.println("Blok finally - przeznaczony do pozamykania wszystkich nie używanych rzeczy");
        }


    }
}
