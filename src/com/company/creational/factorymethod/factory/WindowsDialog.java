package com.company.creational.factorymethod.factory;

import com.company.creational.factorymethod.Button;
import com.company.creational.factorymethod.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}