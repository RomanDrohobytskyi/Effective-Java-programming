package effective.java.com.patterns.head.first.examples.strategy.behavior.quack;

public class Quack implements QuackBehavior {
    public static final String QUACK = "Quack";

    @Override
    public String quack() {
        return QUACK;
    }
}
