package effective.java.com.company.patterns.decorator.decorators;

public abstract class AddOnDecorator extends Beverage {
    public abstract int cost();
    public abstract String description();
}