package effective.java.com.head.first.examples.adapter;

public class WildTurkey implements Turkey {
    public static final String WILD_TURKEY_GOBBLE = "Wild Turkey Gobble";
    public static final String WILD_TURKEY_FLY = "Wild Turkey Fly";

    @Override
    public String gobble() {
        return WILD_TURKEY_GOBBLE;
    }

    @Override
    public String fly() {
        return WILD_TURKEY_FLY;
    }
}
