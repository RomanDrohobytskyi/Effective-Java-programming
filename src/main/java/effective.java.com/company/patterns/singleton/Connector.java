package effective.java.com.company.patterns.singleton;

/**
 * <h2> This is singleton class.</h2>
 * <br>
 * Lazily initialization.
 */
public class Connector {

    private static Connector connectionUrl;

    private Connector(){ }

    public static Connector getInstance() {
        if (connectionUrl != null)
            return connectionUrl;
        else
            return connectionUrl = new Connector();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " singleton.";
    }
}
