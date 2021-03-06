package com.company.structural.bridge;

import com.company.structural.bridge.devices.Device;
import com.company.structural.bridge.devices.Radio;
import com.company.structural.bridge.devices.Tv;
import com.company.structural.bridge.remotes.AdvancedRemote;
import com.company.structural.bridge.remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
