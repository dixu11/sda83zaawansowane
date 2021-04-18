package dziedziczenie;

import dziedziczenie.model.Dog;

class SuperDemo {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {

    private String name;

  /*  public A(){
        System.out.println("Constr A");
    }*/

    A(String name) {
        this.name = name;
        System.out.println("Constr A name" );
    }
}

class  B extends A {


    B(String name) {
        super(name);
    }

    B(){
        super("Jan");
    }
}
// konstruktory się nie dziedziczą tylko musi zostać wywołany konstruktor każdej z klas bazowych od najwyższej
// do jawnego wywołania konstruktora z klasy wyżej służy 'super()', pozwala też przekazać odpowiednie parametry
// i przez to wybrać odpowiedni konstruktor
