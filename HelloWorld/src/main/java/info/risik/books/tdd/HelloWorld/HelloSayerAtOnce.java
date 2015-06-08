package info.risik.books.tdd.HelloWorld;

/**
 * tdd-book-java
 * Created by Sergei Borisov on 07/06/15.
 */
public class HelloSayerAtOnce implements HelloSayer {
    private String whom;
    private String message;

    public HelloSayerAtOnce(String whom) {
        this.whom = whom;
        this.message = String.format("Hello \"%s\"", whom);
    }

    @Override
    public String getWhom() {
        return whom;
    }

    @Override
    public String getGreetingString() {
        return message;
    }
}
