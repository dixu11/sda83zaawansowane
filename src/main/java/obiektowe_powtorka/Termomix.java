package obiektowe_powtorka;

public class Termomix {

   private double volumeInLiters;

   public Termomix(){
       volumeInLiters = 0.5;
   }

   public Termomix(double volume){
       volumeInLiters = volume;
   }

    void createYoghurt() {
        System.out.println("Termomix wytwarza " + volumeInLiters + " l jogurtu");
    }

    public void cook(Vegetable rawVegetable) {
        int time = rawVegetable.getTimeToCook();
        rawVegetable.cookFor(time);
        System.out.println(rawVegetable.getName() + " ugotowane!");
    }

    public void setVolumeInLiters( double newVolume){
        volumeInLiters = newVolume;
    }

}
