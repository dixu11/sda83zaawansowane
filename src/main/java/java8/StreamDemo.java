package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(23, 45, 67, 34, 123, 456, 342, 3, 2, 5, 76, 8));

        numbers.forEach(number -> System.out.println(number));
       // numbers.removeIf(number -> number % 2 == 0);
        System.out.println(numbers);

        /*for (Integer number : numbers) {
            System.out.println(number);
        }*/

        String text = "asdgfh";
        System.out.println(
                text.toUpperCase()
                .repeat(5)
                .replace("AS","...")
        );



        numbers.stream()
                .filter(number -> number<100) // odsiewam liczby ponizej 100
                .map(number -> number+10) //chcę do kazdej liczby dodać 100
                .forEach(number -> System.out.println(number));

        List<Product> products = new ArrayList<>();
        products.add(new Product("chleb",3));
        products.add(new Product("mleko",2.5));
        products.add(new Product("jajka", 6));
        products.add(new Product("jajka eco", 8));
        products.add(new Product("jabłka 1kg", 2));


        products.stream()
                .filter(product -> product.getPrice()>5)
                .map(product -> product.getName().toUpperCase())
                .forEach(product -> System.out.println(product));

        List<Product> filteredList = products.stream()
                .filter(product -> product.getName().contains("jajka"))
                .collect(Collectors.toList());

        System.out.println(filteredList);

        int[] ints = {23, 4, 67, 45};

     int sum = Arrays.stream(ints).sum();
        System.out.println(sum);


        List<String> names = products.stream()
                .map(product -> product.getName())
                .map(name -> name.toUpperCase())
                .filter(name -> name.startsWith("J"))
                .sorted(  (name1,name2) ->  name2.compareTo(name1) )
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
