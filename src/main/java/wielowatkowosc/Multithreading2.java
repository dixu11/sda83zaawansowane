package wielowatkowosc;

import java.util.*;

class Multithreading2 {

    public static void main(String[] args) throws InterruptedException {
        LetterRandomizer randomizer = new LetterRandomizer(2_000_000);
        randomizer.startRandomizing();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Naciśnij enter aby awaryjnie przerwać pracę!");
        scanner.nextLine();  //zatrzymywanie scannerem - pojdzie dalej jak coś wpisze lub sam enter
        //Thread.sleep(1000); // zaczekaj sekundę (1000 ms)
        randomizer.abortTask();
       // randomizer.waitForResults();
        List<String> result = randomizer.getResult();
        System.out.println("Przygotowano słów: " + result.size());
        //System.out.println(randomizer);
    }


}


class LetterRandomizer implements Runnable {

    private int words;
    private List<String> result = new ArrayList<>();
    private List<Character> letters = new ArrayList<>();
    private Thread thread;
    private boolean aborted = false;

    public LetterRandomizer(int words) {
        prepareLettersAtoZ();
        this.words = words;
        thread = new Thread(this);
    }

    private void prepareLettersAtoZ() {
        for (int i = 'a'; i <= 'z'; i++) {
            letters.add((char) i);
        }
    }

    public void startRandomizing() {
        thread.start();
    }

    public void waitForResults() throws InterruptedException {
        thread.join();
    }

    public void abortTask() {
        aborted = true;
    }

    @Override
    public void run() {
        for (int i = 0; i < words; i++) {
            Random random = new Random();
            //przygotuj wszystkie litery
            List<Character> copy = new ArrayList<>(letters);
            //wymieszaj
            Collections.shuffle(copy);
            //wytnij pierwsze 10
            copy = copy.subList(0, random.nextInt(10) + 1);
            //zmień w String
            String text = "";
            for (Character character : copy) {
                text += character;
            }
            result.add(text);
            //zatrzymaj jeśli aborted == true
            if (aborted) {
                break;
            }
        }
    }



    List<String> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "LetterRandomizer{" +
                "words=" + words +
                ", result=" + result +
                ", letters=" + letters +
                ", thread=" + thread +
                '}';
    }
}


