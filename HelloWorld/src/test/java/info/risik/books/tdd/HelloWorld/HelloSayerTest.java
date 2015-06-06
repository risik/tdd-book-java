package info.risik.books.tdd.HelloWorld;

import com.pholser.junit.quickcheck.ForAll;
import org.junit.Test;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * tdd-book-java
 * Created by Sergei Borisov on 06/06/15.
 */

@RunWith(Theories.class)
public class HelloSayerTest {

    @Theory
    public void testCreating(
            @ForAll String whom
    ) {
        new HelloSayer(whom);
    }

    @Theory
    public void testWhomGetter(
            @ForAll String whom
    ) {
        HelloSayer sayer = new HelloSayer(whom);
        assertEquals(whom, sayer.getWhom());
    }

    @Theory
    public void greetingString(
            @ForAll String whom
    ) {
        HelloSayer sayer = new HelloSayer(whom);
        assertEquals(String.format("Hello \"%s\"", whom), sayer.getGreetingString());
    }
}