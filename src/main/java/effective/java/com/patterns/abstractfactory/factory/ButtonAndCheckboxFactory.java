package effective.java.com.patterns.abstractfactory.factory;

import effective.java.com.patterns.abstractfactory.model.button.Button;
import effective.java.com.patterns.abstractfactory.model.checkbox.Checkbox;

public interface ButtonAndCheckboxFactory {
    Button createButton();
    Checkbox createCheckbox();
}
