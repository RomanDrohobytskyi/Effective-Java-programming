package com.company.patterns.abstractfactory.factory;

import com.company.patterns.abstractfactory.model.button.Button;
import com.company.patterns.abstractfactory.model.checkbox.Checkbox;

public interface ButtonAndCheckboxFactory {
    Button createButton();
    Checkbox createCheckbox();
}
