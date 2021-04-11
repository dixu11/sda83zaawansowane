public class Pixel {

    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
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
}
