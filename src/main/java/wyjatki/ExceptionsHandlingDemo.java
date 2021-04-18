package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionsHandlingDemo {

    public static void main(String[] args) {

      /*  String name = null;
        if(name == null | name.isEmpty()) {  // spowoduje null pointer

        }*/




        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ulubioną liczbę :)");
        try {
            String name2 = "Marcin";
            System.out.println("Twoje imie: " + name2.toUpperCase());
            int favorite = scanner.nextInt();
            System.out.println("Też lubię liczbę " + favorite + " !");
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
            System.out.println("Coś jeszcze...");
        } catch (InputMismatchException e) {
            System.out.println("Dlaczego nie podałeś liczby... :(");
        } catch (NullPointerException e) {
            System.out.println("Brak imienia");
        }catch (Exception e){
            System.out.println("Niespodziewany wyjątek:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Koniec programu");
    }

}
