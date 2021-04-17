import org.junit.jupiter.api.*;
import testowanie.Pixel;

import static org.junit.jupiter.api.Assertions.*;

class PixelTest {

    //given
   private Pixel pixel = new Pixel(2, 3);
   private Pixel pixel2 = new Pixel(4, 4);

    public PixelTest() {
        System.out.println("Tworze klase testu i wraz z nią jej pola z pixelami");
    }

    @BeforeAll //uruchmia się raz przed wszystkimi testami i wymaga oznaczenia static
   static public void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach // uruchamia się raz przed kazdym testem
    public void before() {
        System.out.println("before");
    }

    @AfterEach
    public void after() {
        System.out.println("after");
    }

    @AfterAll
   static public void afterAll() {
        System.out.println("after all");
    }



    @Test
    public void getSum_should_sum_coordinates() {
        //given - przygotowanie

        //when - sytuacja którą sprawdzamy
        int sum = pixel.getSum();

        //than - czy efekt jest taki jak oczekiwaliśmy
        assertEquals(5,sum);
    }

    @Test
    public void incrementX_should_add_one_to_property_x(){
        pixel.incrementX();
        assertEquals(3,  pixel.getX());
    }

    @Test
    public void should_sum_two_pixels(){
        pixel.addOtherPixel(pixel2);

        assertEquals(6,pixel.getX());
        assertEquals(7,pixel.getY());
    }



}
