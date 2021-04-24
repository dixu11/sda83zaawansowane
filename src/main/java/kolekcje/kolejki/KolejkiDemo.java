package kolekcje.kolejki;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

class KolejkiDemo {
    public static void main(String[] args) {
//        Queue<String> myQueue = new LinkedList<>();
        Queue<String> myQueue = new ArrayBlockingQueue<>(5); // lista z ograniczonym rozmiarem
        myQueue.add("abc");
        myQueue.add("efg");
        myQueue.add("ggggg");
        myQueue.add("ccccc");
        myQueue.add("yyyyyyyyy");

        System.out.println(myQueue);
        String removedElement = myQueue.remove();
        System.out.println(removedElement);
        System.out.println(myQueue);
        myQueue.remove();
        System.out.println(myQueue);

        System.out.println("Metoda podgląda najbizszy element : " +myQueue.remove());
        System.out.println(myQueue);
        myQueue.remove();
        myQueue.remove();
        //myQueue.remove(); // NoSuchElementException - jeśli zabraknie!
        //System.out.println(myQueue.element()); // NoSuchElementException - jeśli zabraknie!
        System.out.println(myQueue.poll()); // odpowiednik remove ale zwraca null
        System.out.println(myQueue.peek()); // odpowiednik element ale zwraca null zamiast rzucać wyjątek
        myQueue.add("1");
        myQueue.add("2");
        myQueue.add("3");
        myQueue.add("4");
        myQueue.add("5");
        //myQueue.add("6"); // IllegalStateException // jeśli zapełnimy kolejkę
        boolean result = myQueue.offer("6");
        System.out.println("Czy udało się dodać? "  +result);
        //First In -> First Out - kolejka

        Deque<Integer> numbers = new LinkedList<>();
        //rozszerzony interfejs kolejek
        //stos -> Last In First Out

        // do metod ograniczonych czasowo -> potrzebne w środowisku wielowątkowym
        //BlockingQueue<Integer> wielowatkoweZastosowanie = new ArrayBlockingQueue<>(10);

        Queue<Integer> priorityQueue  = new PriorityQueue<>();
        priorityQueue.add(123);
        priorityQueue.add(222);
        priorityQueue.add(10);
        priorityQueue.add(15);
        System.out.println(priorityQueue);

    }
}
