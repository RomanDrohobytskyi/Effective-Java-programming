package effective.java.com.abstractfactory.factory;

import effective.java.com.abstractfactory.model.button.Button;
import effective.java.com.abstractfactory.model.button.MacOSButton;
import effective.java.com.abstractfactory.model.checkbox.Checkbox;
import effective.java.com.abstractfactory.model.checkbox.MacOSCheckbox;

public class ButtonAndCheckboxMacOSFactory implements ButtonAndCheckboxFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
