package effective.java.com.company.patterns.abstractfactory.model.checkbox;


public class MacOSCheckbox implements Checkbox {
    @Override
    public void click() {
        System.out.println("MacOSCheckbox was created.");
    }
}
