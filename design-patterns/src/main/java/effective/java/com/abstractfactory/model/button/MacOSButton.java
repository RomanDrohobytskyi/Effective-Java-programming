package effective.java.com.abstractfactory.model.button;

public class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOSButton was created.");
    }
}
