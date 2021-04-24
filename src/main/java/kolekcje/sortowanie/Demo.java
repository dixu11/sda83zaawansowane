package kolekcje.sortowanie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Demo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(23);
        numbers.add(10);
        numbers.add(33);
        numbers.add(100);
        numbers.add(100);
        numbers.add(-10);
        numbers.add(70);

        //    23        10        // 23 - 10 = 13
         // return 1
        //   -100      -50      0      50    100....
        //  10         33        // 10 - 33 = -23
        // return -1
        //  100       100       //  100 - 100 = 0
        // return  0

        // -30  -20          //-30 - -20 = -10
        //  return -1
        // -20  -30         // -20 - -30 = 10
        //  return 1

        //tu implementuje algorytm
        int first = -10;
        int sec = 10;

        if (compareNumbers(first, sec) > 0) {
            System.out.println("daj mie ją w prawo");
        } else if (compareNumbers(first, sec) < 0) {
            System.out.println("Daj mie ją w lewo");
        } else {
            System.out.println("Zostaw je w spokoju");
        }

        List<String> names = new ArrayList<>();
        names.add("Karol");
        names.add("Wiesław");
        names.add("Wiesława");
        names.add("Wojtek");
        names.add("Dominik");
        names.add("Dominika");
        names.add("Marcin");


        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                if (result == 0) {
                    result = o1.compareTo(o2);
                }
                return result;
            }
        });
        System.out.println(names);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return Integer.compare(num1, num2);
               // return num2 - num1;
               /* if (num1> num2) {
                    return 1;
                } else if (num1 < num2) {
                    return -1;
                } else {
                    return 0;
                }
                */
            }
        });

        System.out.println(numbers);


    }

    //implementacja sortowania rosnącego
    public static int compareNumbers(int num1, int num2 ){
        if (num1> num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }


}
