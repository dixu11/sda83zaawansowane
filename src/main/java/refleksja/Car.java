package refleksja;

import java.io.Serializable;
import java.util.Random;

public   class Car implements Serializable,Comparable {

   private double price;
   private String model;


    public Car() {
        System.out.println("Zrobiony");
        price = new Random().nextInt(10000)+1000;
        model = "Honda Civic";
    }

   public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }


    public void ride(int distance) {
        System.out.println("Jedziesz "  + distance +  "km samochodem " +model);
    }

    public void ride() {
        System.out.println("Jedziesz samochodem " + model);
    }

    double getPrice() {
        return price;
    }

    String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
