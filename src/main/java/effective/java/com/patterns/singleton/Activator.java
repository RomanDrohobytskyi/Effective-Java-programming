package effective.java.com.patterns.singleton;


/**
 * <h2> This is singleton class.</h2>
 * <br>
 * Eagerly  initialization.
 */
public class Activator {

    private static Activator ACTIVATOR = new Activator();

    private Activator(){}

    public static Activator getInstance() {
        return ACTIVATOR;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " singleton.";
    }
}
