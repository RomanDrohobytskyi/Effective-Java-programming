package effective.java.com.abstractfactory.factory;


import effective.java.com.abstractfactory.model.button.Button;
import effective.java.com.abstractfactory.model.checkbox.Checkbox;

public interface ButtonAndCheckboxFactory {
    Button createButton();
    Checkbox createCheckbox();
}
