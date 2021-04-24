package anonimowe;

public class Demo {


    public static void main(String[] args) {
        PakietowaKlasa pakietowaKlasa = new PakietowaKlasa();
        Demo demo = new Demo();
      //  InnerClass innerClass = demo.new InnerClass(); // klasa wewnetrzna niestatyczna musi być powiązana z obiektem klasy zewnetrznej
        InnerClass innerClass = new InnerClass();//klasa wewnetrzna statyczna działa jak wszystkie inne klasy

        class LocalClass{

        }
        LocalClass klasaLokalna = new LocalClass();


        Car car = new Car();
        car.drive();

        Car truck = new Car(){ // <anonimowa> extends Car
            public void drive(){
                System.out.println("Ciężarówka jedzie");
            }
        };

        System.out.println(car.getClass());
        System.out.println(truck.getClass());
        truck.drive();


    }

    //jeśli nie jest statyczna - związana z obiektem klasy zewnętrznej (Demo), jeśli chcemy samodzielną to musi być statyczna
   static class InnerClass { // klasa wewnętrzna - zadeklarowana w innej klasie

    }
}


//w pliku możemy zrobić tylko jedną publiczną klasę ale dowolną ilość klas pakietowych
class PakietowaKlasa {

}
