package effective.java.com.patterns.head.first.examples.strategy.behavior.fly;

public class FlyWithWings implements FlyBehavior {
    public static final String FLY_WITH_WINGS = "Fly with wings";

    @Override
    public String fly() {
        return FLY_WITH_WINGS;
    }
}
