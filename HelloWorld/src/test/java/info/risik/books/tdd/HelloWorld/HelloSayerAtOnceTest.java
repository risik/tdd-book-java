package info.risik.books.tdd.HelloWorld;

import com.pholser.junit.quickcheck.ForAll;
import junit.framework.TestCase;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

/**
 * tdd-book-java
 * Created by Sergei Borisov on 07/06/15.
 */

@RunWith(Theories.class)
public class HelloSayerAtOnceTest extends TestCase {

    @Theory
    public void testCreating(
            @ForAll String whom
    ) {
        new HelloSayerAtOnce(whom);
    }

    @Theory
    public void testWhomGetter(
            @ForAll String whom
    ) {
        HelloSayer sayer = new HelloSayerAtOnce(whom);
        assertEquals(whom, sayer.getWhom());
    }

    @Theory
    public void greetingString(
            @ForAll String whom
    ) {
        HelloSayer sayer = new HelloSayerAtOnce(whom);
        assertEquals(String.format("Hello \"%s\"", whom), sayer.getGreetingString());
    }
}