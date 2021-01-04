package com.company.patterns.abstractfactory;

import com.company.patterns.abstractfactory.factory.ButtonAndCheckboxFactory;
import com.company.patterns.abstractfactory.model.button.Button;
import com.company.patterns.abstractfactory.model.checkbox.Checkbox;

public class AbstractFactory {
    private final Button button;
    private final Checkbox checkbox;

    public AbstractFactory(ButtonAndCheckboxFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void clickButtonAndCheckbox() {
        this.button.click();
        this.checkbox.click();
    }
}
