package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.checkboxes.Checkbox;
import com.company.creational.abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
