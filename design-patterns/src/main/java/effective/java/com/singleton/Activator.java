package effective.java.com.singleton;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * <h2> This is singleton class.</h2>
 * <br>
 * Eagerly  initialization.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Activator {

    private static final Activator ACTIVATOR = new Activator();

    public static Activator getInstance() {
        return ACTIVATOR;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " singleton.";
    }
}
