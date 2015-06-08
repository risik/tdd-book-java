package info.risik.books.tdd.HelloWorld;

/**
 * tdd-book-java
 * Created by Sergei Borisov on 07/06/15.
 */
public class HelloSayerLazy implements HelloSayer {
    private String whom;
    private String message;

    public HelloSayerLazy(String whom) {
        this.whom = whom;
        this.message = null;
    }

    @Override
    public String getWhom() {
        return whom;
    }

    @Override
    public String getGreetingString() {
        if (message == null) {
            makeMessage();
        }
        return message;
    }

    private void makeMessage() {
        message = String.format("Hello \"%s\"", whom);
    }
}
