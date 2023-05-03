package effective.java.com.abstractfactory.model.button;

public class WindowsOSButton implements Button {
    @Override
    public void click() {
        System.out.println("WindowsOSButton was created.");
    }
}
