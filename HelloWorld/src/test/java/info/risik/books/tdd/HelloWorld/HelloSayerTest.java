package info.risik.books.tdd.HelloWorld;

import com.pholser.junit.quickcheck.ForAll;
import com.pholser.junit.quickcheck.generator.ValuesOf;
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

    enum HelloSayerType {
        InPlace,
        AtOnce,
        Lazy,
    }

    @Theory
    public void testCreating(
            @ForAll String whom,
            @ForAll @ValuesOf HelloSayerType sayerType
    ) throws Exception {
        getFactory(sayerType, whom);
    }

    @Theory
    public void testWhomGetter(
            @ForAll String whom,
            @ForAll @ValuesOf HelloSayerType sayerType
    ) throws Exception {
        HelloSayer sayer = getFactory(sayerType, whom);
        assertEquals(whom, sayer.getWhom());
    }

    @Theory
    public void greetingString(
            @ForAll String whom,
            @ForAll @ValuesOf HelloSayerType sayerType
    ) throws Exception {
        HelloSayer sayer = getFactory(sayerType, whom);
        assertEquals(String.format("Hello \"%s\"", whom), sayer.getGreetingString());
    }

    private HelloSayer getFactory(HelloSayerType type, String whom) throws Exception {
        switch (type) {
            case InPlace:
                return new HelloSayerInplace(whom);
            case AtOnce:
                return new HelloSayerAtOnce(whom);
            case Lazy:
                return new HelloSayerLazy(whom);
        }
        throw new Exception("Unknown HelloSayerType");
    }
}