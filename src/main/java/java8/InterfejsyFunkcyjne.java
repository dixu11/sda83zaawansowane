package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

class InterfejsyFunkcyjne {
    public static void main(String[] args) {
        MyConsumer printer = (String text)->{
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i) + " ");
            }
            System.out.println("!");
        };
        printer.printIt("Hello world");

        //Consumer - nic nie zwraca  np: (String) -> void
        //Supplier - nic nie przyjmuje i coś zwraca np : () -> String
        //Predicate - zwraca boolean np : (String) -> boolean
        //Function  - coś przyjmuje coś zwraca np: String -> int
        //Operator - coś przyjmuje to samo zwraca np: String -> String
        //Comparator - przyjmuje dwie rzeczy i zwraca int np: (String String) -> int

        Comparator<String> compareText = (text1, text2) -> text1.length() - text2.length();
        List<String> names = new ArrayList<>(List.of("Adam", "Ania", "Andrzej", "Arek"));
        names.sort(compareText);
        System.out.println(names);

        Predicate<String> notContainsSpaces =  (String password) -> {
            if (password.contains(" ")) {
                return true;
            } else {
                return false;
            }
        };
        //skrócona wersja
        Predicate<String> notContainsSpaces2 = password -> password.contains(" ");

        System.out.println(notContainsSpaces.test("masło"));
        System.out.println(notContainsSpaces.test("ala ma kota"));

        BinaryOperator<Double> add = (a, b)-> a+b;
        System.out.println(add.apply(2.0,3.0));


    }
}
