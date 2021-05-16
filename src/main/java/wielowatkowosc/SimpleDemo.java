package wielowatkowosc;

class SimpleDemo {
    public static void main(String[] args) throws InterruptedException {
        //Runnable - zadanie -> obiekt wykonywalny
       /* Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Pozdrowienia z osobnego wątku!");
            }
        };*/



        //Thread - pracownik / wykonawca



        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Wątek 1 instrukcja nr " + i);
            }
        };

        Runnable task2 = ()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("Wątek 2 instrukcja nr " + i);
            }
        };


        //stworzenie osobnej nici kodu (watek)
        Thread thread = new Thread(task1);
        Thread thread2 = new Thread(task2);
        //startowanie metodą start ( NIE RUN!)
        thread.start();
        thread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Wątek main instrukcja nr " + i);
        }
//        Thread.sleep(1000);
        System.out.println("Main skończył pracę :D");
        thread.join();  // zaczekaj aż kolega skończy
        System.out.println("Thread 1 skończył pracę");
        thread2.join();
        System.out.println("Koniec programu");
    }
}
