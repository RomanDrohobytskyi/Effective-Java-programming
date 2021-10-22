package effective.java.com.patterns.head.first.examples.strategy.behavior.quack;

public class MuteQuack implements QuackBehavior {
    public static final String MUTE_QUACK = "Mute quack";

    @Override
    public String quack() {
        return MUTE_QUACK;
    }
}
