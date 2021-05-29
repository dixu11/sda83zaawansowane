package obiektowe_powtorka;

public class TermomixDemo {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable(10,"Marchewka");
        Vegetable vegetable2 = new Vegetable(5,"Cebula");

        vegetable.eat();
        vegetable2.cookFor(3);
        vegetable2.eat();
        vegetable2.cookFor(6);
        vegetable2.eat();

        Termomix termomix = new Termomix(1);
        Termomix termomix2 = new Termomix(1.5);


//        termomix.setVolumeInLiters(1);
//        termomix2.setVolumeInLiters(1.5);

        termomix.createYoghurt();
        termomix2.createYoghurt();




    }
}
