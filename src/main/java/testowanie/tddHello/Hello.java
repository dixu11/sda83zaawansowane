package testowanie.tddHello;

public class Hello {

  /*  his Kata is designed to help practice what a test of a pure function ought to look like.
    It is intentionally designed to start with a very easy, non-branching base case which slowly
    becomes addled with complexity as additional requirements are added that will require significant
    branching and eventually a pressure to compose additional units.

    This Kata was suggested by Nick Gauthier and inspired a bit by Bob from Exercism.

    This Kata is designed to be used with Detroit-school TDD.*/


    String greet(String name) {
        if (name == null) {
            return "Hello, my friend.";
        }
        if (isUpperCase(name)) {
            return "HELLO, " + name + "!";
        }
        return "Hello, " + name + ".";
    }

    boolean isUpperCase(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isUpperCase(sentence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
