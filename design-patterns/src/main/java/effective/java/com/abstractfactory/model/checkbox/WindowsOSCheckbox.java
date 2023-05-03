package effective.java.com.abstractfactory.model.checkbox;

public class WindowsOSCheckbox implements Checkbox {
    @Override
    public void click() {
        System.out.println("WindowsOSCheckbox was created.");
    }
}
