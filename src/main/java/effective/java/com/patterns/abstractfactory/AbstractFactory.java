package effective.java.com.patterns.abstractfactory;

import effective.java.com.patterns.abstractfactory.factory.ButtonAndCheckboxFactory;
import effective.java.com.patterns.abstractfactory.model.button.Button;
import effective.java.com.patterns.abstractfactory.model.checkbox.Checkbox;
import lombok.Getter;

public class AbstractFactory {
    @Getter private final Button button;
    @Getter private final Checkbox checkbox;

    public AbstractFactory(ButtonAndCheckboxFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void clickButtonAndCheckbox() {
        this.button.click();
        this.checkbox.click();
    }
}
