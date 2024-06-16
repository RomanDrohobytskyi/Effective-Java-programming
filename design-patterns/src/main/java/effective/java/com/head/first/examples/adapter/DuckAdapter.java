package effective.java.com.head.first.examples.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DuckAdapter implements Turkey {
    private final Duck duck;

    @Override
    public String gobble() {
        return duck.quack();
    }

    @Override
    public String fly() {
        return duck.fly();
    }
}
