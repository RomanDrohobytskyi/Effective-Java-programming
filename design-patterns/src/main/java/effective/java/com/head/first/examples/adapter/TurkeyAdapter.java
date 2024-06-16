package effective.java.com.head.first.examples.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    @Override
    public String quack() {
        return turkey.gobble();
    }

    @Override
    public String fly() {
        return turkey.fly();
    }
}
