package com.company.patterns.abstractfactory.factory;

import com.company.patterns.abstractfactory.model.button.Button;
import com.company.patterns.abstractfactory.model.button.WindowsOSButton;
import com.company.patterns.abstractfactory.model.checkbox.Checkbox;
import com.company.patterns.abstractfactory.model.checkbox.WindowsOSCheckbox;

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
