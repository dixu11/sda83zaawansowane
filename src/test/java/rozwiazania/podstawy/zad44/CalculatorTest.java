package rozwiazania.podstawy.zad44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
   private Calculator calculator = new Calculator();

    @Test
    public void sum_should_return_sum_of_two_values() {
        assertEquals(50, calculator.sum(20, 30));
        assertEquals(1, calculator.sum(-2, 3));
    }

    @Test
    public void subtract_should_minus_second_value_from_first() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void divide_should_divide_first_by_second() {
        assertEquals(2, calculator.divide(50, 25));
        assertEquals(2.5,calculator.divide(5,2));
    }

    @Test
    public void divide_should_not_allow_to_divide_by_zero() {
        assertEquals(-1, calculator.divide(20, 0));
        assertEquals(-1, calculator.divide(2, 0));
    }

    @Test
    public void multiply_should_return_multiplication() {
        assertEquals(100, calculator.multiply(50, 2));
    }
}
