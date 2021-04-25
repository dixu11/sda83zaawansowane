package java8;

class LambdaDemo {
    public static void main(String[] args) {
        ButtonAction action = new ButtonAction() {
            @Override
            public void pushButton() {
                System.out.println("Hello");
            }
        };

        action.pushButton();


        //implementacja funkcji za pomocą anonimowej klasy z abstrakcyjną metodą
        MathOperation add = new MathOperation() {
            @Override
            public double execute(double number1, double number2) {
                return number1 + number2;
            }
        };
        System.out.println(add.execute(2, 2));

        //dla interfejsów funkcyjnych ( z dokładnie jedną abstrakcyjną metodą) można zastosować lambdy
        MathOperation subtraction = (double number1, double number2) -> {
            return number1 - number2;
        };

        //to z którego obiektu jest brana sygnatura wynika z kontekstu
        // (wrzucam do zmiennej MathOperation -> więc budujemy lambdę na tym interfejsie)
        MathOperation multiplication = ( n1,  n2) ->  n1 * n2;
        //można pominąć typy zmiennych ale typy dalej są brane z sygnatury metody w interfejsie
        //można pominąć return oraz klamrę dla jednej instrukcji

        System.out.println(subtraction.execute(10, 5));
        System.out.println(multiplication.execute(3, 4));

    }
}
