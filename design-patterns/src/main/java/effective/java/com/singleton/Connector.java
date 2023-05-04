package effective.java.com.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static java.util.Objects.requireNonNullElseGet;

/**
 * <h2> This is singleton class.</h2>
 * <br>
 * Lazily initialization.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Connector {

    private static Connector connectionUrl;

    public static Connector getInstance() {
        return requireNonNullElseGet(connectionUrl, () -> connectionUrl = new Connector());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " singleton.";
    }
}
