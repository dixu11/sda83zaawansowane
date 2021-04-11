import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PixelTest {



    @Test
    public void getSum_should_sum_coordinates() {
        //given - przygotowanie
        Pixel pixel = new Pixel(2, 3);

        //when - sytuacja którą sprawdzamy
        int sum = pixel.getSum();

        //than - czy efekt jest taki jak oczekiwaliśmy
        assertEquals(5,sum);
    }

    @Test
    public void incrementX_should_add_one_to_property_x(){
        Pixel pixel = new Pixel(2, 3);
        pixel.incrementX();
        assertEquals(3,  pixel.getX());
    }



}