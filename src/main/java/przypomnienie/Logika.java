package przypomnienie;

class Logika {
    public static void main(String[] args) {
        // &&  - leniwy operator and
        // & - gorliwy operator and

        String text = null;

        if ( text != null & !text.isEmpty()) { // spowoduje null poiter bo sprawdzi obie częsci - raczej nie używamy
            System.out.println("Nie jest pusty");
            System.out.println(text.toUpperCase());
        }
    }
}
