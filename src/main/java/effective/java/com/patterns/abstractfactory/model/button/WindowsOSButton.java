package effective.java.com.patterns.abstractfactory.model.button;

public class WindowsOSButton implements Button {
    @Override
    public void click() {
        System.out.println("WindowsOSButton was created.");
    }
}
