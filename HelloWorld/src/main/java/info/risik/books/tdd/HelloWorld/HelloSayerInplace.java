package info.risik.books.tdd.HelloWorld;

/**
 * tdd-book-java
 * Created by Sergei Borisov on 06/06/15.
 */
public class HelloSayerInplace implements HelloSayer {
    private String whom;

    public HelloSayerInplace(String whom) {
        this.whom = whom;
    }

    @Override
    public String getWhom() {
        return whom;
    }

    @Override
    public String getGreetingString() {
        return String.format("Hello \"%s\"", whom);
    }
}
