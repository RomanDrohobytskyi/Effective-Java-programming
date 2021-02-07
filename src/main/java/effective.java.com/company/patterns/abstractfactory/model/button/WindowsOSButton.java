package effective.java.com.company.patterns.abstractfactory.model.button;

public class WindowsOSButton implements Button {
    @Override
    public void click() {
        System.out.println("WindowsOSButton was created.");
    }
}