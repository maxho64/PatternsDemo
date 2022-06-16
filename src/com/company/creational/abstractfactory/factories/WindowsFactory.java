package com.company.creational.abstractfactory.factories;


import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.buttons.WindowsButton;
import com.company.creational.abstractfactory.checkboxes.Checkbox;
import com.company.creational.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}