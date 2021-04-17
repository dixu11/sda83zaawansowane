package testowanie;

public class Pixel {

    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tworzę pixel");
    }


    public int getSum(){
        return x+y;
    }

    public void incrementX() {
        x +=1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void addOtherPixel(Pixel pixel){ // do koordynatów dodaje koordynaty innego przekazanego pixela
        x += pixel.x;
        y += pixel.y;
    }
}
