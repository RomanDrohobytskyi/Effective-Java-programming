package effective.java.com.head.first.examples.adapter;

public class MallardDuck implements Duck {
    public static final String MALLARD_DUCK_QUACK = "Mallard Duck Quack";
    public static final String MALLARD_DUCK_FLY = "Mallard Duck Fly";

    @Override
    public String quack() {
        return MALLARD_DUCK_QUACK;
    }

    @Override
    public String fly() {
        return MALLARD_DUCK_FLY;
    }
}
