package effective.java.com.patterns.abstractfactory.model.checkbox;

public class WindowsOSCheckbox implements Checkbox {
    @Override
    public void click() {
        System.out.println("WindowsOSCheckbox was created.");
    }
}