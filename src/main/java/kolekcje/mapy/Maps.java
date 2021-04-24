package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

class Maps {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;

        System.out.println(numbers[1]);

        Map<String, Double> bank = new HashMap<>();

        bank.put("piraci", 10000.0);
        bank.put("mafia", 5000.0);


        System.out.println(bank);

        System.out.println(bank.get("taboret"));
        System.out.println(bank.get("piraci"));
        System.out.println(bank.get("mafia"));

        double finansePiratow = bank.get("piraci");
        bank.put("piraci", finansePiratow + 100);
        System.out.println(bank);


        //iteracja po kluczach
        for (String klucz : bank.keySet()) {
            System.out.println(klucz + " ------- " + bank.get(klucz));
        }

        //iteracja po wartosciach
        for (double warosc : bank.values()) {
            System.out.println(warosc);
        }

        //iteracja po parach (obiekty Entry)
        for (Map.Entry<String, Double> para : bank.entrySet()) {
            System.out.println(para);
            System.out.println(para.getKey() + "------" + para.getValue());
        }

        String nazwaNowegoKonta = "gangsterzy";

        if (!bank.containsKey(nazwaNowegoKonta)) {
            System.out.println("Przygotowuję konto bo podano nie istniejacy klucz");
            bank.put(nazwaNowegoKonta, 0.0);
        } else {
            System.out.println("W mapie znajduje się taki klucz");
        }
        System.out.println(bank);

        System.out.println(bank.getOrDefault("inkwizycja",-1.0)); // zwraca default jeśli nie znajdzie
        System.out.println(bank.size());

    }
}
