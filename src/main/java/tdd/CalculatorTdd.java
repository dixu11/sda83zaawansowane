package tdd;

public class CalculatorTdd {

    //Create a simple String calculator with a method signature:
    //
    //———————————————
    //
    //int Add(string numbers)
    //
    //———————————————
    //
    //The method can take up to two numbers, separated by commas, and will return their sum.
    //
    //for example “” or “1” or “1,2” as inputs.
    //
    //(for an empty string it will return 0)
    //
    //Hints:
    //
    //——————
    //
    // - Start with the simplest test case of an empty string and move to one and two numbers
    //
    // - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
    //
    // - Remember to refactor after each passing test
    //
    //———————————————————————————————
    //
    //Allow the Add method to handle an unknown amount of numbers
    //
    //————————————————————————————————
    //
    //Allow the Add method to handle new lines between numbers (instead of commas).
    //
    //    the following input is ok: “1\n2,3” (will equal 6)
    //
    //    the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
    //
    //    ——————————————————————————————-
    //
    //Support different delimiters
    //
    //    to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
    //
    //    the first line is optional. all existing scenarios should still be supported
    //
    //    ————————————————————————————————
    //
    //Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.
    //
    //if there are multiple negatives, show all of them in the exception message.
    //
    //————————————————————————————————
    //
    //STOP HERE if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.

    int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        if(hasTwoNumbers(numbers)){
            return sumTwoNumbers(numbers);
        }
        return parseOneNumber(numbers);
    }

    private boolean hasTwoNumbers(String numbers){
        return numbers.contains(",");
    }

    private int parseOneNumber(String numbers) {
       return Integer.parseInt(numbers);
    }

    private int sumTwoNumbers(String numbers){
        String[] elements = numbers.split(",");
        int number1 = Integer.parseInt(elements[0]);
        int number2 = Integer.parseInt(elements[1]);
        return number1 + number2;
    }
}
