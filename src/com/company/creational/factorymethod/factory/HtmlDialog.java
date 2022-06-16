package com.company.creational.factorymethod.factory;

import com.company.creational.factorymethod.Button;
import com.company.creational.factorymethod.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}