package wyjatki;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

class Shop {

    private List<Product> products = new LinkedList<>();


    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductByName(String name) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new ProductNotFoundException(name);
    }

}


