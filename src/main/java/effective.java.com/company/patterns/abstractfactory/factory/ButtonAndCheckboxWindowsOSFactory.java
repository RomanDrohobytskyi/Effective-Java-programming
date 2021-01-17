package effective.java.com.company.patterns.abstractfactory.factory;

import effective.java.com.company.patterns.abstractfactory.model.button.Button;
import effective.java.com.company.patterns.abstractfactory.model.button.WindowsOSButton;
import effective.java.com.company.patterns.abstractfactory.model.checkbox.Checkbox;
import effective.java.com.company.patterns.abstractfactory.model.checkbox.WindowsOSCheckbox;

public class ButtonAndCheckboxWindowsOSFactory implements ButtonAndCheckboxFactory {
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsOSCheckbox();
    }
}
