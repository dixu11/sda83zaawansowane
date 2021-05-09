package wzorceprojektowe.creational.singleton;

class SingletonDemo {

    public static void main(String[] args) {

       /* PriceList priceList = PriceList.getInstance();
        PriceList priceList2 = PriceList.getInstance();


        if (priceList == priceList2) {
            System.out.println("To ten sam obiekt");
        } else {
            System.out.println("Powstały dwa różne obiekty!");
        }*/

        //zaimplementowane tak,
        // aby odniesienie do innej składowej klasy nie powodowało stworzenia obiektu niepotrzebnie
        System.out.println(PriceListLazy.MINIMAL_PRICE);
        PriceListLazy lazy = PriceListLazy.getInstance();
        PriceListLazy lazy2 = PriceListLazy.getInstance();

        //enum z jedną wartością to też singleton
        PriceListEnum priceListEnum1 = PriceListEnum.INSTANCE;
        PriceListEnum priceListEnum2 = PriceListEnum.INSTANCE;



    }


}
