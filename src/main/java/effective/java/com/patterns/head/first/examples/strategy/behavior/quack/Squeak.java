package effective.java.com.patterns.head.first.examples.strategy.behavior.quack;

public class Squeak implements QuackBehavior {
    public static final String SQUEAK = "Squeak";

    @Override
    public String quack() {
        return SQUEAK;
    }
}
