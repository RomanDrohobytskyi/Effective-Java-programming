package effective.java.com.chain.of.responsibility;

import static java.util.Objects.isNull;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (isLast()) {
            return true;
        }

        return next.check(email, password);
    }

    private boolean isLast() {
        return isNull(next);
    }
}
