package przypomnienie;

import interfaces.model.Cat;
import interfaces.model.DomesticCat;

class SuperDziedziczenie {
    public static void main(String[] args) {
        Cat cat = new DomesticCat();

        B b = new B();
        b.metoda("abc");
        b.metoda();

        /*List<Object> objects = new ArrayList<>();
        objects.add(cat);
        objects.add(b);*/


        A a = b;
        b.subclassMethod();
        //a.subclassMethod();


        if(a instanceof  B){  // eliminuje ryzyko błędu rzutowania na nieodpowiednią klasę
            B bInstance = (B)a;
            bInstance.subclassMethod();
        }


    }

}


class A{

   /* A() { // konstruktor bezparametrowy, domyślnie wywoływany przez podklase
        System.out.println("create A");
    }*/

    A(String a){ // konstruktor parametrowy, aby go wywołać w podklasie trzeba przekazać tekst

    }

   protected void metoda() {
        System.out.println("działanie A");
    }
}

class B extends A{

    B() {
        super("abc");
        System.out.println("create B");
    }


    public void metoda() {
        System.out.println("Działanie B");
    }

    public void metoda(String tekst) {
        System.out.println("Działanie B " + tekst);
    }

    public void subclassMethod() {
        System.out.println("specific behavior");
    }
}
