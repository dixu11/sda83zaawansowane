package wzorceprojektowe.creational.singleton;

//Singleton implementacja
class PriceList {

    //3. Przechowywać zawsze jeden i ten sam obiekt
    private static PriceList priceList = new PriceList();

    //1. ukryć konstruktor
    private PriceList() {

    }

    //2. dostarczać obiekt przez statyczną metodę (dostęp globalny)
    public static PriceList getInstance() {
        return priceList;
    }

}
