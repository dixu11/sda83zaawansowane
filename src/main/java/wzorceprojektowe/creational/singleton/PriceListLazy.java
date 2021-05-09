package wzorceprojektowe.creational.singleton;

class PriceListLazy {


    private static PriceListLazy priceList = null;
    public static  int MINIMAL_PRICE = 10;

    private PriceListLazy() {
        System.out.println("Creating object");
    }

    public static PriceListLazy getInstance() {
        if (priceList == null) {
            priceList = new PriceListLazy();
        }
        return priceList;
    }




}
