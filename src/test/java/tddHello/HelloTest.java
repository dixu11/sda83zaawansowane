package tddHello;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    /* Requirement 1

     Write a method greet(name) that interpolates name in a simple greeting. For example,
     when name is "Bob", the method should return a string "Hello, Bob.".

     Requirement 2
     Handle nulls by introducing a stand-in.
     For example, when name is null, then the method
     should return the string "Hello, my friend."
     Requirement 3
     Handle shouting. When name is all uppercase, then the method should shout back to the user.
     For example, when name is "JERRY" then the method should return the string "HELLO JERRY!"
     Requirement 4

     Handle two names of input. When name is an array of two names
             (or, in languages that support it, varargs or a splat), then both names should be printed.
     For example, when name is ["Jill", "Jane"], then the method should return the string
         "Hello, Jill and Jane."*/
    @Test
    void should_use_name_in_greeting() {
        Hello hello = new Hello();
        String greeting1 = hello.greet("Bob");
        String greeting2 = hello.greet("Anna");

        assertEquals("Hello, Bob.",greeting1);
        assertEquals("Hello, Anna.",greeting2);
    }

    @Test
    void should_use_generic_greeting_for_null_name(){
        Hello hello = new Hello();
        String greeting = hello.greet(null);
        assertEquals("Hello, my friend.",greeting);
    }

    @Test
    void should_shout_when_name_all_upperCase(){
        Hello hello = new Hello();

        String greeting = hello.greet("BOB");
        assertEquals("HELLO, BOB!", greeting);
    }


}