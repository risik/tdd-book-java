package info.risik.books.tdd.HelloWorld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * tdd-book-java
 * Created by Sergei Borisov on 06/06/15.
 */
public class HelloSayerTest {

    @Test
    public void testCreating() throws Exception {
        new HelloSayer("World");
    }

    @Test
    public void testWhomGetter() throws Exception {
        HelloSayer sayer = new HelloSayer("World");
        assertEquals("World", sayer.getWhom());
    }
}