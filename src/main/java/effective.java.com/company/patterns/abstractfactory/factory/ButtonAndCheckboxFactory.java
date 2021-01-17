package effective.java.com.company.patterns.abstractfactory.factory;

import effective.java.com.company.patterns.abstractfactory.model.button.Button;
import effective.java.com.company.patterns.abstractfactory.model.checkbox.Checkbox;

public interface ButtonAndCheckboxFactory {
    Button createButton();
    Checkbox createCheckbox();
}
