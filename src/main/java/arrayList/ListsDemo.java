package arrayList;

import java.util.*;

class ListsDemo {
    public static void main(String[] args) {
        int[] numbers = {234, 56, 78, 34, 23};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        int firstNumber = numbers[0];
        numbers[1] = 30;
        System.out.println(Arrays.toString(numbers));



        ArrayList<Integer> list = new ArrayList<>();
        list.add(234);
        list.add(56);
        list.add(78);
        System.out.println(list);
        list.add(8);
        System.out.println(list);
        System.out.println(list);
        System.out.println(list.get(0));
        int firstNumber2 =(int) list.get(0);
        list.set(3,70);
        System.out.println(list);
        System.out.println("Rozmiar: " + list.size());
        list.remove(1);
        System.out.println(list);
        System.out.println("Rozmiar: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        //iterator wykorzystywany w tle przez for-each
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int element = iterator.next();
            System.out.println(element);
        }

        System.out.println("------");

        List<String> text = new ArrayList<>();
        text.add("dog");
        text.add("cat");
        text.add("dog");
        text.add("monkey");
        System.out.println(text);
        text.remove("dog");
//        int i = text.lastIndexOf("dog");
//        text.remove(i);

//        text.clear();
        System.out.println(text);
        if (text.contains("dog")) {
            System.out.println("tak, jest pies w liście");
        }

        ArrayList<String> otherAnimals = new ArrayList<>(text); // nowa lista z zawartością z pierwszej (dog,cat,monkey)
        System.out.println(otherAnimals);
        otherAnimals.remove("monkey"); // tu zostanie dog, cat
        text.removeAll(otherAnimals); // z listy która ma dog cat mankey, usuń: (dog, cat)
        System.out.println(text); // zostało monkey

    }

    public static int[] addElement(int[] tab, int element){
        int[] biggerTab = new int[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            biggerTab[i] = tab[i];
        }
        biggerTab[biggerTab.length - 1] = element;
        return biggerTab;
    }
}
