package effective.java.com.patterns.head.first.examples.strategy.behavior.fly;

public class FlyNoWay implements FlyBehavior {
    public static final String FLY_NO_WAY = "Fly no way";

    @Override
    public String fly() {
        return FLY_NO_WAY;
    }
}