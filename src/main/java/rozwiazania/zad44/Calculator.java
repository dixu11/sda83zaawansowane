package rozwiazania.zad44;

public class Calculator {
    public double sum(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public double subtract(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    public double multiply(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public double divide(double firstValue, double secondValue) {
        if (secondValue == 0) {
            System.out.println("Division by zero");
            return -1;
        }
        return firstValue / secondValue;
    }
}
