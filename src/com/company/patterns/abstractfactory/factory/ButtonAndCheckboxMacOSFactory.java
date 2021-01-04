package com.company.patterns.abstractfactory.factory;

import com.company.patterns.abstractfactory.model.button.Button;
import com.company.patterns.abstractfactory.model.button.MacOSButton;
import com.company.patterns.abstractfactory.model.checkbox.Checkbox;
import com.company.patterns.abstractfactory.model.checkbox.MacOSCheckbox;

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
