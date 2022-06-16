package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.factories.GUIFactory;
import com.company.creational.abstractfactory.factories.MacOSFactory;
import com.company.creational.abstractfactory.factories.WindowsFactory;

public class Main {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory = createFactory();
        app = new Application(factory);
        return app;
    }

    private static GUIFactory createFactory() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            return new MacOSFactory();
        }
        return new WindowsFactory();
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
