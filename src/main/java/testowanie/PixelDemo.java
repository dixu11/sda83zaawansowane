package testowanie;

public class PixelDemo {
    public static void main(String[] args) {
        Pixel pixel = new Pixel(3,4);
        int result = pixel.getSum();
        System.out.println(result);

        pixel.incrementX();
        System.out.println(pixel.getX());

        Pixel pixel2 = new Pixel(2, 7);
        pixel.addOtherPixel(pixel2);
        System.out.println("X: " + pixel.getX()); // da 5
        System.out.println("Y: " + pixel.getY()); // da 11
    }
}
