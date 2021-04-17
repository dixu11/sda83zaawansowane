package rozwiazania.bankomat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BankomatTest {

   private Bankomat bankomat = new Bankomat(1234);

    @Test
    void newBankomat_should_have_concrete_money_value(){
        //given, when
        //Bankomat bankomat = new Bankomat(1234);
        //than
        assertEquals(5000,bankomat.getMoney());
        assertThat(bankomat.getMoney()).isEqualTo(5000); // assertJ
    }

    @Test
    void should_check_pin(){
        //given
//        Bankomat bankomat = new Bankomat(1234);
        //when
        boolean shouldBeCorrect = bankomat.isPinCorrect(1234);
        boolean shouldBeIncorrect = bankomat.isPinCorrect(3455);
        //than
        assertTrue(shouldBeCorrect);
        assertThat(shouldBeCorrect).isTrue(); // assertJ
        assertFalse(shouldBeIncorrect);
        assertThat(shouldBeIncorrect).isFalse(); // assertJ
    }

    @Test
    void should_decrease_money_if_have_enough() {
        //when
        bankomat.takeMoney(4000);
        bankomat.takeMoney(1000);

        //than
        assertEquals(0,bankomat.getMoney());
    }

    @Test
    void should_not_accept_negative_values(){
        bankomat.takeMoney(-3);
        assertEquals(5000,bankomat.getMoney());
    }

    @Test
    void should_not_decrease_money_if_dont_have_enough() {
        //when
        bankomat.takeMoney(5001);

        //than
        assertEquals(5000,bankomat.getMoney());
    }




}