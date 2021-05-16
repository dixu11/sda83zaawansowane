package wielowatkowosc;

class SynchronizationProblem {
    public static void main(String[] args) throws InterruptedException {
        Incrementator incrementator = new Incrementator();
        Thread t1 = new Thread(incrementator);
        Thread t2 = new Thread(incrementator);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Doliczono do: " + incrementator.getCount());


    }
}

class Incrementator implements Runnable{

    private int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
               increment();
            Object ob = new Object();
        }
    }

    private synchronized void increment() { // tylko jeden wątek na raz
       /* int lastValue = count;
        int newValue = lastValue + 1;
        count = newValue;*/
        count++;
    }

    int getCount() {
        return count;
    }
}
