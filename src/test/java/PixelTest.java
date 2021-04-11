import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PixelTest {

    @Test
    public void testPixel() {
        //given - przygotowanie
        Pixel pixel = new Pixel(2, 3);

        //when - sytuacja którą sprawdzamy
        int sum = pixel.getSum();

        //than - czy efekt jest taki jak oczekiwaliśmy
        assertEquals(5,sum);
    }

}