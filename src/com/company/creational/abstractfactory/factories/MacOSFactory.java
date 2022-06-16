package com.company.creational.abstractfactory.factories;

import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.buttons.MacOSButton;
import com.company.creational.abstractfactory.checkboxes.Checkbox;
import com.company.creational.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
