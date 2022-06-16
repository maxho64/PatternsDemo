package com.company.creational.abstractfactory.factories;

import com.company.creational.abstractfactory.buttons.Button;
import com.company.creational.abstractfactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}