package testowanie.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTddTest {

   private CalculatorTdd calculator = new CalculatorTdd();

    @Test
    void should_return_0_for_empty_string(){
        int result = calculator.add("");
        assertEquals(0,result);
    }

    @Test
    void should_return_number_for_one_number_string(){
        int result = calculator.add("1");
        assertEquals(1,result);
    }

    @Test
    void should_return_sum_for_two_numbers(){
        int result = calculator.add("1,2");
        assertEquals(3,result);
    }

}
