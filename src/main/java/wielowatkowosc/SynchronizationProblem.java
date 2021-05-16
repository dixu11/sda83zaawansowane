package wielowatkowosc;

import java.util.concurrent.atomic.AtomicInteger;

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
        System.out.println("Doliczono do: " + incrementator.getAtomicCount());


    }
}

class Incrementator implements Runnable{

    private int count = 0;
    private AtomicInteger atomicCount = new AtomicInteger(0);
    //atomowe operacje -> wątek je robi za jednym zamachem, inny mu się nie wtrąci

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //count++; //problem
               increment();
            atomicCount.incrementAndGet(); // zwieksz o 1
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

    AtomicInteger getAtomicCount() {
        return atomicCount;
    }
}
